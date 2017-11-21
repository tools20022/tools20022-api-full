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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Quorum;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of quorum quantity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuorumQuantity1Choice#mmQuorumQuantity
 * QuorumQuantity1Choice.mmQuorumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.QuorumQuantity1Choice#mmQuorumQuantityPercentage
 * QuorumQuantity1Choice.mmQuorumQuantityPercentage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Quorum Quorum}</li>
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
 * "QuorumQuantity1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of quorum quantity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "QuorumQuantity1Choice", propOrder = {"quorumQuantity", "quorumQuantityPercentage"})
public class QuorumQuantity1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text quorumQuantity;
	/**
	 * Minimum quantity of securities required to hold a meeting.
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
	 * {@linkplain com.tools20022.repository.entity.Quorum#mmQuantity
	 * Quorum.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuorumQuantity1Choice
	 * QuorumQuantity1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QrmQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuorumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities required to hold a meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuorumQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quorum.mmQuantity;
			componentContext_lazy = () -> QuorumQuantity1Choice.mmObject();
			isDerived = false;
			xmlTag = "QrmQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuorumQuantity";
			definition = "Minimum quantity of securities required to hold a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PercentageRate quorumQuantityPercentage;
	/**
	 * Minimum quantity of securities, expressed as a percentage, required to
	 * hold a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quorum#mmPercentage
	 * Quorum.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.QuorumQuantity1Choice
	 * QuorumQuantity1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QrmQtyPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuorumQuantityPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities, expressed as a percentage, required to hold a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuorumQuantityPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quorum.mmPercentage;
			componentContext_lazy = () -> QuorumQuantity1Choice.mmObject();
			isDerived = false;
			xmlTag = "QrmQtyPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuorumQuantityPercentage";
			definition = "Minimum quantity of securities, expressed as a percentage, required to hold a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(QuorumQuantity1Choice.mmQuorumQuantity, QuorumQuantity1Choice.mmQuorumQuantityPercentage);
				trace_lazy = () -> Quorum.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuorumQuantity1Choice";
				definition = "Choice of quorum quantity.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "QrmQty", required = true)
	public Max35Text getQuorumQuantity() {
		return quorumQuantity;
	}

	public void setQuorumQuantity(Max35Text quorumQuantity) {
		this.quorumQuantity = quorumQuantity;
	}

	@XmlElement(name = "QrmQtyPctg", required = true)
	public PercentageRate getQuorumQuantityPercentage() {
		return quorumQuantityPercentage;
	}

	public void setQuorumQuantityPercentage(PercentageRate quorumQuantityPercentage) {
		this.quorumQuantityPercentage = quorumQuantityPercentage;
	}
}