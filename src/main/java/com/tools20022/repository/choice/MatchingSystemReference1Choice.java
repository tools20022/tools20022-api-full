/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a matching system unique identification or the related
 * reference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingSystemReference1Choice#mmMatchingSystemUniqueReference
 * MatchingSystemReference1Choice.mmMatchingSystemUniqueReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingSystemReference1Choice#mmRelatedReference
 * MatchingSystemReference1Choice.mmRelatedReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradeIdentification
 * TradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MatchingSystemReference1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a matching system unique identification or the related reference. "
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MatchingSystemReference1Choice", propOrder = {"matchingSystemUniqueReference", "relatedReference"})
public class MatchingSystemReference1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text matchingSystemUniqueReference;
	/**
	 * Reference to the unique system identification assigned to the trade by
	 * the central matching system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmMatchingReference
	 * TradeIdentification.mmMatchingReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingSystemReference1Choice
	 * MatchingSystemReference1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSysUnqRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingSystemUniqueReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the unique system identification assigned to the trade  by the central matching system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMatchingSystemUniqueReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmMatchingReference;
			componentContext_lazy = () -> MatchingSystemReference1Choice.mmObject();
			isDerived = false;
			xmlTag = "MtchgSysUnqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingSystemUniqueReference";
			definition = "Reference to the unique system identification assigned to the trade  by the central matching system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text relatedReference;
	/**
	 * Refers to the identification of a previous event in the life of a trade
	 * which is amended or cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingSystemReference1Choice
	 * MatchingSystemReference1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Refers to the identification of a previous event in the life of a trade which is amended or cancelled. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelatedReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> MatchingSystemReference1Choice.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Refers to the identification of a previous event in the life of a trade which is amended or cancelled. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MatchingSystemReference1Choice.mmMatchingSystemUniqueReference, MatchingSystemReference1Choice.mmRelatedReference);
				trace_lazy = () -> TradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MatchingSystemReference1Choice";
				definition = "Choice between a matching system unique identification or the related reference. ";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MtchgSysUnqRef", required = true)
	public Max35Text getMatchingSystemUniqueReference() {
		return matchingSystemUniqueReference;
	}

	public void setMatchingSystemUniqueReference(Max35Text matchingSystemUniqueReference) {
		this.matchingSystemUniqueReference = matchingSystemUniqueReference;
	}

	@XmlElement(name = "RltdRef", required = true)
	public Max35Text getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(Max35Text relatedReference) {
		this.relatedReference = relatedReference;
	}
}