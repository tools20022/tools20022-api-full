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
import com.tools20022.repository.choice.BillingMethod1Choice;
import com.tools20022.repository.codeset.ServicePaymentMethod1Code;
import com.tools20022.repository.entity.CashAccountService;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the values used for every line item service in the statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService2#mmServiceDetail
 * BillingService2.mmServiceDetail}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingService2#mmPrice
 * BillingService2.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService2#mmPaymentMethod
 * BillingService2.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService2#mmOriginalChargePrice
 * BillingService2.mmOriginalChargePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService2#mmOriginalChargeSettlementAmount
 * BillingService2.mmOriginalChargeSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService2#mmBalanceRequiredAccountAmount
 * BillingService2.mmBalanceRequiredAccountAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService2#mmTaxDesignation
 * BillingService2.mmTaxDesignation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingService2#mmTaxCalculation
 * BillingService2.mmTaxCalculation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccountService
 * CashAccountService}</li>
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
 * "BillingService2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the values used for every line item service in the statement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.BillingService1
 * BillingService1}</li>
 * </ul>
 */
public class BillingService2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BillingServiceParameters3 serviceDetail;
	/**
	 * Specifies further detailed values for this service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters3
	 * BillingServiceParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcDtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceDetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies further detailed values for this service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmServiceDetail
	 * BillingService1.mmServiceDetail}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceDetail = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CashAccountService.mmObject();
			componentContext_lazy = () -> BillingService2.mmObject();
			isDerived = false;
			xmlTag = "SvcDtl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceDetail";
			definition = "Specifies further detailed values for this service.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BillingService1.mmServiceDetail;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.BillingServiceParameters3.mmObject();
		}
	};
	protected BillingPrice1 price;
	/**
	 * Price applied to the service, expressed in the pricing currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BillingPrice1
	 * BillingPrice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
	 * Product.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price applied to the service, expressed in the pricing currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmPrice
	 * BillingService1.mmPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmUnitPrice;
			componentContext_lazy = () -> BillingService2.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Price applied to the service, expressed in the pricing currency.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BillingService1.mmPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BillingPrice1.mmObject();
		}
	};
	protected ServicePaymentMethod1Code paymentMethod;
	/**
	 * Code identifying the disposition of the calculated charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethod1Code
	 * ServicePaymentMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmPaymentMethod
	 * CashAccountService.mmPaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code identifying the disposition of the calculated charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmPaymentMethod
	 * BillingService1.mmPaymentMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmPaymentMethod;
			componentContext_lazy = () -> BillingService2.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Code identifying the disposition of the calculated charge.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BillingService1.mmPaymentMethod;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ServicePaymentMethod1Code.mmObject();
		}
	};
	protected AmountAndDirection34 originalChargePrice;
	/**
	 * Amount of the calculated charge, expressed in the pricing currency. This
	 * value does not include any tax on the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
	 * Product.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlChrgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalChargePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the calculated charge, expressed in the pricing currency. This value does not include any tax on the service."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmOriginalChargePrice
	 * BillingService1.mmOriginalChargePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalChargePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmUnitPrice;
			componentContext_lazy = () -> BillingService2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlChrgPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalChargePrice";
			definition = "Amount of the calculated charge, expressed in the pricing currency. This value does not include any tax on the service.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BillingService1.mmOriginalChargePrice;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection34.mmObject();
		}
	};
	protected AmountAndDirection34 originalChargeSettlementAmount;
	/**
	 * Amount of the calculated charge, expressed in the settlement currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Service#mmAmount
	 * Service.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlChrgSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalChargeSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the calculated charge, expressed in the settlement currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmOriginalChargeSettlementAmount
	 * BillingService1.mmOriginalChargeSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOriginalChargeSettlementAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Service.mmAmount;
			componentContext_lazy = () -> BillingService2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlChrgSttlmAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalChargeSettlementAmount";
			definition = "Amount of the calculated charge, expressed in the settlement currency.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BillingService1.mmOriginalChargeSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection34.mmObject();
		}
	};
	protected AmountAndDirection34 balanceRequiredAccountAmount;
	/**
	 * Average daily collected balance required to offset a balance compensable
	 * service charge, exclusive of taxes, expressed in the account currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection34
	 * AmountAndDirection34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmAmount
	 * CashBalance.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalReqrdAcctAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceRequiredAccountAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Average daily collected balance required to offset a balance compensable service charge, exclusive of taxes, expressed in the account currency."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmBalanceRequiredAccountAmount
	 * BillingService1.mmBalanceRequiredAccountAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalanceRequiredAccountAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashBalance.mmAmount;
			componentContext_lazy = () -> BillingService2.mmObject();
			isDerived = false;
			xmlTag = "BalReqrdAcctAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceRequiredAccountAmount";
			definition = "Average daily collected balance required to offset a balance compensable service charge, exclusive of taxes, expressed in the account currency.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BillingService1.mmBalanceRequiredAccountAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection34.mmObject();
		}
	};
	protected ServiceTaxDesignation1 taxDesignation;
	/**
	 * Provides the details of the taxable status of a service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1
	 * ServiceTaxDesignation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRecord Tax.mmRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDsgnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDesignation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the details of the taxable status of a service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmTaxDesignation
	 * BillingService1.mmTaxDesignation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxDesignation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmRecord;
			componentContext_lazy = () -> BillingService2.mmObject();
			isDerived = false;
			xmlTag = "TaxDsgnt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDesignation";
			definition = "Provides the details of the taxable status of a service.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BillingService1.mmTaxDesignation;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.ServiceTaxDesignation1.mmObject();
		}
	};
	protected BillingMethod1Choice taxCalculation;
	/**
	 * Provides tax related values for tax calculation methods A, B or D.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice
	 * BillingMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BillingService2
	 * BillingService2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxClctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides tax related values for  tax calculation methods A, B or D."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmTaxCalculation
	 * BillingService1.mmTaxCalculation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxCalculation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmTax;
			componentContext_lazy = () -> BillingService2.mmObject();
			isDerived = false;
			xmlTag = "TaxClctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCalculation";
			definition = "Provides tax related values for  tax calculation methods A, B or D.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BillingService1.mmTaxCalculation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BillingMethod1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingService2.mmServiceDetail, com.tools20022.repository.msg.BillingService2.mmPrice, com.tools20022.repository.msg.BillingService2.mmPaymentMethod,
						com.tools20022.repository.msg.BillingService2.mmOriginalChargePrice, com.tools20022.repository.msg.BillingService2.mmOriginalChargeSettlementAmount,
						com.tools20022.repository.msg.BillingService2.mmBalanceRequiredAccountAmount, com.tools20022.repository.msg.BillingService2.mmTaxDesignation, com.tools20022.repository.msg.BillingService2.mmTaxCalculation);
				trace_lazy = () -> CashAccountService.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BillingService2";
				definition = "Specifies the values used for every line item service in the statement.";
				previousVersion_lazy = () -> BillingService1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public BillingServiceParameters3 getServiceDetail() {
		return serviceDetail;
	}

	public void setServiceDetail(com.tools20022.repository.msg.BillingServiceParameters3 serviceDetail) {
		this.serviceDetail = serviceDetail;
	}

	public BillingPrice1 getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.msg.BillingPrice1 price) {
		this.price = price;
	}

	public ServicePaymentMethod1Code getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(ServicePaymentMethod1Code paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public AmountAndDirection34 getOriginalChargePrice() {
		return originalChargePrice;
	}

	public void setOriginalChargePrice(com.tools20022.repository.msg.AmountAndDirection34 originalChargePrice) {
		this.originalChargePrice = originalChargePrice;
	}

	public AmountAndDirection34 getOriginalChargeSettlementAmount() {
		return originalChargeSettlementAmount;
	}

	public void setOriginalChargeSettlementAmount(com.tools20022.repository.msg.AmountAndDirection34 originalChargeSettlementAmount) {
		this.originalChargeSettlementAmount = originalChargeSettlementAmount;
	}

	public AmountAndDirection34 getBalanceRequiredAccountAmount() {
		return balanceRequiredAccountAmount;
	}

	public void setBalanceRequiredAccountAmount(com.tools20022.repository.msg.AmountAndDirection34 balanceRequiredAccountAmount) {
		this.balanceRequiredAccountAmount = balanceRequiredAccountAmount;
	}

	public ServiceTaxDesignation1 getTaxDesignation() {
		return taxDesignation;
	}

	public void setTaxDesignation(com.tools20022.repository.msg.ServiceTaxDesignation1 taxDesignation) {
		this.taxDesignation = taxDesignation;
	}

	public BillingMethod1Choice getTaxCalculation() {
		return taxCalculation;
	}

	public void setTaxCalculation(BillingMethod1Choice taxCalculation) {
		this.taxCalculation = taxCalculation;
	}
}