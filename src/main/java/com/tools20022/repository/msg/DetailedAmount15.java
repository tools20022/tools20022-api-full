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
import com.tools20022.repository.msg.DetailedAmount4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount15#mmAmountGoodsAndServices
 * DetailedAmount15.mmAmountGoodsAndServices}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmCashBack
 * DetailedAmount15.mmCashBack}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmGratuity
 * DetailedAmount15.mmGratuity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmFees
 * DetailedAmount15.mmFees}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmRebate
 * DetailedAmount15.mmRebate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DetailedAmount15#mmValueAddedTax
 * DetailedAmount15.mmValueAddedTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DetailedAmount15#mmSurcharge
 * DetailedAmount15.mmSurcharge}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DetailedAmount15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Detailed amounts associated with the total amount of transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.DetailedAmount7
 * DetailedAmount7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DetailedAmount15", propOrder = {"amountGoodsAndServices", "cashBack", "gratuity", "fees", "rebate", "valueAddedTax", "surcharge"})
public class DetailedAmount15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AmtGoodsAndSvcs")
	protected ImpliedCurrencyAndAmount amountGoodsAndServices;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount15
	 * DetailedAmount15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtGoodsAndSvcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountGoodsAndServices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of purchase goods and services without tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedAmount15, Optional<ImpliedCurrencyAndAmount>> mmAmountGoodsAndServices = new MMMessageAttribute<DetailedAmount15, Optional<ImpliedCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount15.mmObject();
			isDerived = false;
			xmlTag = "AmtGoodsAndSvcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountGoodsAndServices";
			definition = "Amount of purchase goods and services without tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(DetailedAmount15 obj) {
			return obj.getAmountGoodsAndServices();
		}

		@Override
		public void setValue(DetailedAmount15 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setAmountGoodsAndServices(value.orElse(null));
		}
	};
	@XmlElement(name = "CshBck")
	protected ImpliedCurrencyAndAmount cashBack;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount15
	 * DetailedAmount15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount7#mmCashBack
	 * DetailedAmount7.mmCashBack}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedAmount15, Optional<ImpliedCurrencyAndAmount>> mmCashBack = new MMMessageAttribute<DetailedAmount15, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount15.mmObject();
			isDerived = false;
			xmlTag = "CshBck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashBack";
			definition = "Cash-back amount.";
			previousVersion_lazy = () -> DetailedAmount7.mmCashBack;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(DetailedAmount15 obj) {
			return obj.getCashBack();
		}

		@Override
		public void setValue(DetailedAmount15 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setCashBack(value.orElse(null));
		}
	};
	@XmlElement(name = "Grtty")
	protected ImpliedCurrencyAndAmount gratuity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount15
	 * DetailedAmount15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount7#mmGratuity
	 * DetailedAmount7.mmGratuity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DetailedAmount15, Optional<ImpliedCurrencyAndAmount>> mmGratuity = new MMMessageAttribute<DetailedAmount15, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount15.mmObject();
			isDerived = false;
			xmlTag = "Grtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gratuity";
			definition = "Gratuity amount.";
			previousVersion_lazy = () -> DetailedAmount7.mmGratuity;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(DetailedAmount15 obj) {
			return obj.getGratuity();
		}

		@Override
		public void setValue(DetailedAmount15 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setGratuity(value.orElse(null));
		}
	};
	@XmlElement(name = "Fees")
	protected List<DetailedAmount4> fees;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount15
	 * DetailedAmount15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount7#mmFees
	 * DetailedAmount7.mmFees}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DetailedAmount15, List<DetailedAmount4>> mmFees = new MMMessageAssociationEnd<DetailedAmount15, List<DetailedAmount4>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount15.mmObject();
			isDerived = false;
			xmlTag = "Fees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fees";
			definition = "Fees amount.";
			previousVersion_lazy = () -> DetailedAmount7.mmFees;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount4.mmObject();
		}

		@Override
		public List<DetailedAmount4> getValue(DetailedAmount15 obj) {
			return obj.getFees();
		}

		@Override
		public void setValue(DetailedAmount15 obj, List<DetailedAmount4> value) {
			obj.setFees(value);
		}
	};
	@XmlElement(name = "Rbt")
	protected List<DetailedAmount4> rebate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount15
	 * DetailedAmount15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount7#mmRebate
	 * DetailedAmount7.mmRebate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DetailedAmount15, List<DetailedAmount4>> mmRebate = new MMMessageAssociationEnd<DetailedAmount15, List<DetailedAmount4>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount15.mmObject();
			isDerived = false;
			xmlTag = "Rbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rebate";
			definition = "Global rebate of the transaction. This amount is counted as a negative amount.";
			previousVersion_lazy = () -> DetailedAmount7.mmRebate;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount4.mmObject();
		}

		@Override
		public List<DetailedAmount4> getValue(DetailedAmount15 obj) {
			return obj.getRebate();
		}

		@Override
		public void setValue(DetailedAmount15 obj, List<DetailedAmount4> value) {
			obj.setRebate(value);
		}
	};
	@XmlElement(name = "ValAddedTax")
	protected List<DetailedAmount4> valueAddedTax;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount15
	 * DetailedAmount15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount7#mmValueAddedTax
	 * DetailedAmount7.mmValueAddedTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DetailedAmount15, List<DetailedAmount4>> mmValueAddedTax = new MMMessageAssociationEnd<DetailedAmount15, List<DetailedAmount4>>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount15.mmObject();
			isDerived = false;
			xmlTag = "ValAddedTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTax";
			definition = "Value added tax amount.";
			previousVersion_lazy = () -> DetailedAmount7.mmValueAddedTax;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount4.mmObject();
		}

		@Override
		public List<DetailedAmount4> getValue(DetailedAmount15 obj) {
			return obj.getValueAddedTax();
		}

		@Override
		public void setValue(DetailedAmount15 obj, List<DetailedAmount4> value) {
			obj.setValueAddedTax(value);
		}
	};
	@XmlElement(name = "Srchrg")
	protected List<DetailedAmount4> surcharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount4
	 * DetailedAmount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount15
	 * DetailedAmount15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount7#mmSurcharge
	 * DetailedAmount7.mmSurcharge}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DetailedAmount15, List<DetailedAmount4>> mmSurcharge = new MMMessageAssociationEnd<DetailedAmount15, List<DetailedAmount4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DetailedAmount15.mmObject();
			isDerived = false;
			xmlTag = "Srchrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Surcharge";
			definition = "Additional charge paid by the cardholder. For example airline credit card surcharge.";
			previousVersion_lazy = () -> DetailedAmount7.mmSurcharge;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount4.mmObject();
		}

		@Override
		public List<DetailedAmount4> getValue(DetailedAmount15 obj) {
			return obj.getSurcharge();
		}

		@Override
		public void setValue(DetailedAmount15 obj, List<DetailedAmount4> value) {
			obj.setSurcharge(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DetailedAmount15.mmAmountGoodsAndServices, com.tools20022.repository.msg.DetailedAmount15.mmCashBack,
						com.tools20022.repository.msg.DetailedAmount15.mmGratuity, com.tools20022.repository.msg.DetailedAmount15.mmFees, com.tools20022.repository.msg.DetailedAmount15.mmRebate,
						com.tools20022.repository.msg.DetailedAmount15.mmValueAddedTax, com.tools20022.repository.msg.DetailedAmount15.mmSurcharge);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DetailedAmount15";
				definition = "Detailed amounts associated with the total amount of transaction.";
				previousVersion_lazy = () -> DetailedAmount7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ImpliedCurrencyAndAmount> getAmountGoodsAndServices() {
		return amountGoodsAndServices == null ? Optional.empty() : Optional.of(amountGoodsAndServices);
	}

	public DetailedAmount15 setAmountGoodsAndServices(ImpliedCurrencyAndAmount amountGoodsAndServices) {
		this.amountGoodsAndServices = amountGoodsAndServices;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getCashBack() {
		return cashBack == null ? Optional.empty() : Optional.of(cashBack);
	}

	public DetailedAmount15 setCashBack(ImpliedCurrencyAndAmount cashBack) {
		this.cashBack = cashBack;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getGratuity() {
		return gratuity == null ? Optional.empty() : Optional.of(gratuity);
	}

	public DetailedAmount15 setGratuity(ImpliedCurrencyAndAmount gratuity) {
		this.gratuity = gratuity;
		return this;
	}

	public List<DetailedAmount4> getFees() {
		return fees == null ? fees = new ArrayList<>() : fees;
	}

	public DetailedAmount15 setFees(List<DetailedAmount4> fees) {
		this.fees = Objects.requireNonNull(fees);
		return this;
	}

	public List<DetailedAmount4> getRebate() {
		return rebate == null ? rebate = new ArrayList<>() : rebate;
	}

	public DetailedAmount15 setRebate(List<DetailedAmount4> rebate) {
		this.rebate = Objects.requireNonNull(rebate);
		return this;
	}

	public List<DetailedAmount4> getValueAddedTax() {
		return valueAddedTax == null ? valueAddedTax = new ArrayList<>() : valueAddedTax;
	}

	public DetailedAmount15 setValueAddedTax(List<DetailedAmount4> valueAddedTax) {
		this.valueAddedTax = Objects.requireNonNull(valueAddedTax);
		return this;
	}

	public List<DetailedAmount4> getSurcharge() {
		return surcharge == null ? surcharge = new ArrayList<>() : surcharge;
	}

	public DetailedAmount15 setSurcharge(List<DetailedAmount4> surcharge) {
		this.surcharge = Objects.requireNonNull(surcharge);
		return this;
	}
}