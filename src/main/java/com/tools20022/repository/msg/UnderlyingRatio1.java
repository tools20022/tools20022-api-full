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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.entity.UnderlyingRatio;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Related financial instrument into which the security can be converted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingRatio1#mmUnderlyingQuantityDenominator
 * UnderlyingRatio1.mmUnderlyingQuantityDenominator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingRatio1#mmUnderlyingQuantityNumerator
 * UnderlyingRatio1.mmUnderlyingQuantityNumerator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnderlyingRatio1#mmRelatedFinancialInstrumentIdentification
 * UnderlyingRatio1.mmRelatedFinancialInstrumentIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.UnderlyingRatio
 * UnderlyingRatio}</li>
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
 * "UnderlyingRatio1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Related financial instrument into which the security can be converted."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UnderlyingRatio1", propOrder = {"underlyingQuantityDenominator", "underlyingQuantityNumerator", "relatedFinancialInstrumentIdentification"})
public class UnderlyingRatio1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantity1Choice underlyingQuantityDenominator;
	/**
	 * Number of held securities for the exercise.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmUnderlyingQuantityDenominator
	 * UnderlyingRatio.mmUnderlyingQuantityDenominator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingRatio1
	 * UnderlyingRatio1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygQtyDnmtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingQuantityDenominator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of held securities for the exercise."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingQuantityDenominator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> UnderlyingRatio.mmUnderlyingQuantityDenominator;
			componentContext_lazy = () -> UnderlyingRatio1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygQtyDnmtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingQuantityDenominator";
			definition = "Number of held securities for the exercise.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice underlyingQuantityNumerator;
	/**
	 * Number of related securities for the exercise.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmUnderlyingQuantityNumerator
	 * UnderlyingRatio.mmUnderlyingQuantityNumerator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingRatio1
	 * UnderlyingRatio1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygQtyNmrtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingQuantityNumerator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of related securities for the exercise."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnderlyingQuantityNumerator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> UnderlyingRatio.mmUnderlyingQuantityNumerator;
			componentContext_lazy = () -> UnderlyingRatio1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygQtyNmrtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingQuantityNumerator";
			definition = "Number of related securities for the exercise.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SecurityIdentification14> relatedFinancialInstrumentIdentification;
	/**
	 * Related security into which the security can be converted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UnderlyingRatio#mmSecuritiesConversion
	 * UnderlyingRatio.mmSecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingRatio1
	 * UnderlyingRatio1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdFinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedFinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related security into which the security can be converted."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> UnderlyingRatio.mmSecuritiesConversion;
			componentContext_lazy = () -> UnderlyingRatio1.mmObject();
			isDerived = false;
			xmlTag = "RltdFinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedFinancialInstrumentIdentification";
			definition = "Related security into which the security can be converted.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification14.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UnderlyingRatio1.mmUnderlyingQuantityDenominator, UnderlyingRatio1.mmUnderlyingQuantityNumerator, UnderlyingRatio1.mmRelatedFinancialInstrumentIdentification);
				trace_lazy = () -> UnderlyingRatio.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingRatio1";
				definition = "Related financial instrument into which the security can be converted.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UndrlygQtyDnmtr", required = true)
	public FinancialInstrumentQuantity1Choice getUnderlyingQuantityDenominator() {
		return underlyingQuantityDenominator;
	}

	public void setUnderlyingQuantityDenominator(FinancialInstrumentQuantity1Choice underlyingQuantityDenominator) {
		this.underlyingQuantityDenominator = underlyingQuantityDenominator;
	}

	@XmlElement(name = "UndrlygQtyNmrtr", required = true)
	public FinancialInstrumentQuantity1Choice getUnderlyingQuantityNumerator() {
		return underlyingQuantityNumerator;
	}

	public void setUnderlyingQuantityNumerator(FinancialInstrumentQuantity1Choice underlyingQuantityNumerator) {
		this.underlyingQuantityNumerator = underlyingQuantityNumerator;
	}

	@XmlElement(name = "RltdFinInstrmId")
	public List<SecurityIdentification14> getRelatedFinancialInstrumentIdentification() {
		return relatedFinancialInstrumentIdentification;
	}

	public void setRelatedFinancialInstrumentIdentification(List<com.tools20022.repository.msg.SecurityIdentification14> relatedFinancialInstrumentIdentification) {
		this.relatedFinancialInstrumentIdentification = relatedFinancialInstrumentIdentification;
	}
}