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
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Detailed amounts associated with the total amount of transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#mmCashBack
 * DetailedAmount7.mmCashBack}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#mmGratuity
 * DetailedAmount7.mmGratuity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#mmFees
 * DetailedAmount7.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#mmRebate
 * DetailedAmount7.mmRebate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount7#mmValueAddedTax
 * DetailedAmount7.mmValueAddedTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount7#mmSurcharge
 * DetailedAmount7.mmSurcharge}</li>
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
 * "DetailedAmount7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Detailed amounts associated with the total amount of transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15
 * DetailedAmount15}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.DetailedAmount5
 * DetailedAmount5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DetailedAmount7", propOrder = {"cashBack", "gratuity", "fees", "rebate", "valueAddedTax", "surcharge"})
public class DetailedAmount7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ImpliedCurrencyAndAmount cashBack;
	/**
	 * Cash-back amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount7
	 * DetailedAmount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshBck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash-back amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount15#mmCashBack
	 * DetailedAmount15.mmCashBack}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount5#mmCashBack
	 * DetailedAmount5.mmCashBack}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashBack = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> DetailedAmount7.mmObject();
			isDerived = false;
			xmlTag = "CshBck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashBack";
			definition = "Cash-back amount.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount15.mmCashBack);
			previousVersion_lazy = () -> DetailedAmount5.mmCashBack;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount gratuity;
	/**
	 * Gratuity amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount7
	 * DetailedAmount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gratuity amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount15#mmGratuity
	 * DetailedAmount15.mmGratuity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount5#mmGratuity
	 * DetailedAmount5.mmGratuity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGratuity = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> DetailedAmount7.mmObject();
			isDerived = false;
			xmlTag = "Grtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gratuity";
			definition = "Gratuity amount.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount15.mmGratuity);
			previousVersion_lazy = () -> DetailedAmount5.mmGratuity;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedAmount4> fees;
	/**
	 * Fees amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount4
	 * DetailedAmount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount7
	 * DetailedAmount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fees amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmFees
	 * DetailedAmount15.mmFees}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount5#mmFees
	 * DetailedAmount5.mmFees}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFees = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> DetailedAmount7.mmObject();
			isDerived = false;
			xmlTag = "Fees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fees";
			definition = "Fees amount.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount15.mmFees);
			previousVersion_lazy = () -> DetailedAmount5.mmFees;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedAmount4> rebate;
	/**
	 * Global rebate of the transaction. This amount is counted as a negative
	 * amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount4
	 * DetailedAmount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount7
	 * DetailedAmount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rebate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Global rebate of the transaction. This amount is counted as a negative amount."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmRebate
	 * DetailedAmount15.mmRebate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount5#mmRebate
	 * DetailedAmount5.mmRebate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRebate = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> DetailedAmount7.mmObject();
			isDerived = false;
			xmlTag = "Rbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rebate";
			definition = "Global rebate of the transaction. This amount is counted as a negative amount.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount15.mmRebate);
			previousVersion_lazy = () -> DetailedAmount5.mmRebate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedAmount4> valueAddedTax;
	/**
	 * Value added tax amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount4
	 * DetailedAmount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount7
	 * DetailedAmount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value added tax amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount15#mmValueAddedTax
	 * DetailedAmount15.mmValueAddedTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount5#mmValueAddedTax
	 * DetailedAmount5.mmValueAddedTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValueAddedTax = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> DetailedAmount7.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			definition = "Value added tax amount.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount15.mmValueAddedTax);
			previousVersion_lazy = () -> DetailedAmount5.mmValueAddedTax;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedAmount4> surcharge;
	/**
	 * Additional charge paid by the cardholder. For example airline credit card
	 * surcharge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount4
	 * DetailedAmount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount7
	 * DetailedAmount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Srchrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Surcharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional charge paid by the cardholder. For example airline credit card surcharge."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount15#mmSurcharge
	 * DetailedAmount15.mmSurcharge}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSurcharge = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> DetailedAmount7.mmObject();
			isDerived = false;
			xmlTag = "Srchrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Surcharge";
			definition = "Additional charge paid by the cardholder. For example airline credit card surcharge.";
			nextVersions_lazy = () -> Arrays.asList(DetailedAmount15.mmSurcharge);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DetailedAmount7.mmCashBack, DetailedAmount7.mmGratuity, DetailedAmount7.mmFees, DetailedAmount7.mmRebate, DetailedAmount7.mmValueAddedTax, DetailedAmount7.mmSurcharge);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DetailedAmount7";
				definition = "Detailed amounts associated with the total amount of transaction.";
				nextVersions_lazy = () -> Arrays.asList(DetailedAmount15.mmObject());
				previousVersion_lazy = () -> DetailedAmount5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CshBck")
	public ImpliedCurrencyAndAmount getCashBack() {
		return cashBack;
	}

	public void setCashBack(ImpliedCurrencyAndAmount cashBack) {
		this.cashBack = cashBack;
	}

	@XmlElement(name = "Grtty")
	public ImpliedCurrencyAndAmount getGratuity() {
		return gratuity;
	}

	public void setGratuity(ImpliedCurrencyAndAmount gratuity) {
		this.gratuity = gratuity;
	}

	@XmlElement(name = "Fees")
	public List<DetailedAmount4> getFees() {
		return fees;
	}

	public void setFees(List<com.tools20022.repository.msg.DetailedAmount4> fees) {
		this.fees = fees;
	}

	@XmlElement(name = "Rbt")
	public List<DetailedAmount4> getRebate() {
		return rebate;
	}

	public void setRebate(List<com.tools20022.repository.msg.DetailedAmount4> rebate) {
		this.rebate = rebate;
	}

	@XmlElement(name = "ValAddedTax")
	public List<DetailedAmount4> getValueAddedTax() {
		return valueAddedTax;
	}

	public void setValueAddedTax(List<com.tools20022.repository.msg.DetailedAmount4> valueAddedTax) {
		this.valueAddedTax = valueAddedTax;
	}

	@XmlElement(name = "Srchrg")
	public List<DetailedAmount4> getSurcharge() {
		return surcharge;
	}

	public void setSurcharge(List<com.tools20022.repository.msg.DetailedAmount4> surcharge) {
		this.surcharge = surcharge;
	}
}