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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TypeOfAmount7Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Fees between acquirer and issuer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount11#mmType
 * DetailedAmount11.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount11#mmAdditionalType
 * DetailedAmount11.mmAdditionalType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount11#mmAmount
 * DetailedAmount11.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount11#mmOriginalAmount
 * DetailedAmount11.mmOriginalAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "DetailedAmount11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Fees between acquirer and issuer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount12
 * DetailedAmount12}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DetailedAmount10 DetailedAmount10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DetailedAmount11", propOrder = {"type", "additionalType", "amount", "originalAmount"})
public class DetailedAmount11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TypeOfAmount7Code type;
	/**
	 * Type or class of amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount7Code
	 * TypeOfAmount7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmAmountQualifier
	 * CardPayment.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount11
	 * DetailedAmount11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type or class of amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmAmountQualifier;
			componentContext_lazy = () -> DetailedAmount11.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type or class of amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfAmount7Code.mmObject();
		}
	};
	protected Max35Text additionalType;
	/**
	 * Additional information to specify the type of amount.
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
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmAmountQualifier
	 * CardPayment.mmAmountQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount11
	 * DetailedAmount11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information to specify the type of amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount10#mmAdditionalType
	 * DetailedAmount10.mmAdditionalType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmAmountQualifier;
			componentContext_lazy = () -> DetailedAmount11.mmObject();
			isDerived = false;
			xmlTag = "AddtlTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalType";
			definition = "Additional information to specify the type of amount.";
			previousVersion_lazy = () -> DetailedAmount10.mmAdditionalType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AmountAndDirection41 amount;
	/**
	 * Amount value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection41
	 * AmountAndDirection41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount11
	 * DetailedAmount11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount value."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount12#mmAmountToDispense
	 * DetailedAmount12.mmAmountToDispense}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount10#mmAmount
	 * DetailedAmount10.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> DetailedAmount11.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount value.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount12.mmAmountToDispense);
			previousVersion_lazy = () -> DetailedAmount10.mmAmount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection41.mmObject();
		}
	};
	protected AmountAndDirection41 originalAmount;
	/**
	 * Original value of the amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection41
	 * AmountAndDirection41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount11
	 * DetailedAmount11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original value of the amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> DetailedAmount11.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Original value of the amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection41.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DetailedAmount11.mmType, DetailedAmount11.mmAdditionalType, DetailedAmount11.mmAmount, DetailedAmount11.mmOriginalAmount);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DetailedAmount11";
				definition = "Fees between acquirer and issuer.";
				nextVersions_lazy = () -> Arrays.asList(DetailedAmount12.mmObject());
				previousVersion_lazy = () -> DetailedAmount10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Tp", required = true)
	public TypeOfAmount7Code getType() {
		return type;
	}

	public void setType(TypeOfAmount7Code type) {
		this.type = type;
	}

	@XmlElement(name = "AddtlTp")
	public Max35Text getAdditionalType() {
		return additionalType;
	}

	public void setAdditionalType(Max35Text additionalType) {
		this.additionalType = additionalType;
	}

	@XmlElement(name = "Amt", required = true)
	public AmountAndDirection41 getAmount() {
		return amount;
	}

	public void setAmount(com.tools20022.repository.msg.AmountAndDirection41 amount) {
		this.amount = amount;
	}

	@XmlElement(name = "OrgnlAmt")
	public AmountAndDirection41 getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(com.tools20022.repository.msg.AmountAndDirection41 originalAmount) {
		this.originalAmount = originalAmount;
	}
}