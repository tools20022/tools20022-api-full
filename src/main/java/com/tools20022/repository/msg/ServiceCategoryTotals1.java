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
import com.tools20022.repository.choice.AccountIdentification20Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies totals related to the invoice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmAccountIdentification
 * ServiceCategoryTotals1.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmBilledCustomerIdentification
 * ServiceCategoryTotals1.mmBilledCustomerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmTotalTaxableAmount
 * ServiceCategoryTotals1.mmTotalTaxableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmTotalTaxAmount
 * ServiceCategoryTotals1.mmTotalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmTotalInvoiceAmount
 * ServiceCategoryTotals1.mmTotalInvoiceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmServiceCategory
 * ServiceCategoryTotals1.mmServiceCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmServiceItemTotals
 * ServiceCategoryTotals1.mmServiceItemTotals}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ServiceCategoryTotals1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies totals related to the invoice."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ServiceCategoryTotals1", propOrder = {"accountIdentification", "billedCustomerIdentification", "totalTaxableAmount", "totalTaxAmount", "totalInvoiceAmount", "serviceCategory", "serviceItemTotals"})
public class ServiceCategoryTotals1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId")
	protected AccountIdentification20Choice accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification20Choice
	 * AccountIdentification20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1
	 * ServiceCategoryTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of an securities account or cash account belonging to billed customer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceCategoryTotals1.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique identification of an securities account or cash account belonging to billed customer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification20Choice.mmObject();
		}
	};
	@XmlElement(name = "BlldCstmrId")
	protected BICFIIdentifier billedCustomerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1
	 * ServiceCategoryTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlldCstmrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilledCustomerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BIC of the party which is invoiced by the CSD/NCB."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBilledCustomerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceCategoryTotals1.mmObject();
			isDerived = false;
			xmlTag = "BlldCstmrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilledCustomerIdentification";
			definition = "BIC of the party which is invoiced by the CSD/NCB.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}
	};
	@XmlElement(name = "TtlTaxblAmt")
	protected ActiveCurrencyAndAmount totalTaxableAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxableBaseAmount
	 * Tax.mmTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1
	 * ServiceCategoryTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlTaxblAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTaxableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount subject to tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalTaxableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxableBaseAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceCategoryTotals1.mmObject();
			isDerived = false;
			xmlTag = "TtlTaxblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxableAmount";
			definition = "Total amount subject to tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TtlTaxAmt")
	protected ActiveCurrencyAndAmount totalTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1
	 * ServiceCategoryTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum of all tax amounts related to the invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceCategoryTotals1.mmObject();
			isDerived = false;
			xmlTag = "TtlTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxAmount";
			definition = "Sum of all tax amounts related to the invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TtlInvcAmt", required = true)
	protected ActiveCurrencyAndAmount totalInvoiceAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmAmount
	 * Document.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1
	 * ServiceCategoryTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlInvcAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInvoiceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the invoice, being the sum of total invoice lines amounts, total invoice adjustment amount (discounts, allowances and charges) and total tax amounts."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalInvoiceAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceCategoryTotals1.mmObject();
			isDerived = false;
			xmlTag = "TtlInvcAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInvoiceAmount";
			definition = "Total amount of the invoice, being the sum of total invoice lines amounts, total invoice adjustment amount (discounts, allowances and charges) and total tax amounts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "SvcCtgy", required = true)
	protected Max4AlphaNumericText serviceCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1
	 * ServiceCategoryTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement under which or rules under which the transaction should be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmServiceCategory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceCategoryTotals1.mmObject();
			isDerived = false;
			xmlTag = "SvcCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceCategory";
			definition = "Agreement under which or rules under which the transaction should be processed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	@XmlElement(name = "SvcItmTtls")
	protected List<com.tools20022.repository.msg.ServiceItemTotals1> serviceItemTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ServiceItemTotals1
	 * ServiceItemTotals1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmInvoicedProduct
	 * LineItem.mmInvoicedProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1
	 * ServiceCategoryTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcItmTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceItemTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies totals related to the invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmServiceItemTotals = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> LineItem.mmInvoicedProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceCategoryTotals1.mmObject();
			isDerived = false;
			xmlTag = "SvcItmTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceItemTotals";
			definition = "Specifies totals related to the invoice.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ServiceItemTotals1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ServiceCategoryTotals1.mmAccountIdentification, com.tools20022.repository.msg.ServiceCategoryTotals1.mmBilledCustomerIdentification,
						com.tools20022.repository.msg.ServiceCategoryTotals1.mmTotalTaxableAmount, com.tools20022.repository.msg.ServiceCategoryTotals1.mmTotalTaxAmount,
						com.tools20022.repository.msg.ServiceCategoryTotals1.mmTotalInvoiceAmount, com.tools20022.repository.msg.ServiceCategoryTotals1.mmServiceCategory,
						com.tools20022.repository.msg.ServiceCategoryTotals1.mmServiceItemTotals);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ServiceCategoryTotals1";
				definition = "Specifies totals related to the invoice.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AccountIdentification20Choice> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public ServiceCategoryTotals1 setAccountIdentification(AccountIdentification20Choice accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public Optional<BICFIIdentifier> getBilledCustomerIdentification() {
		return billedCustomerIdentification == null ? Optional.empty() : Optional.of(billedCustomerIdentification);
	}

	public ServiceCategoryTotals1 setBilledCustomerIdentification(BICFIIdentifier billedCustomerIdentification) {
		this.billedCustomerIdentification = billedCustomerIdentification;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalTaxableAmount() {
		return totalTaxableAmount == null ? Optional.empty() : Optional.of(totalTaxableAmount);
	}

	public ServiceCategoryTotals1 setTotalTaxableAmount(ActiveCurrencyAndAmount totalTaxableAmount) {
		this.totalTaxableAmount = totalTaxableAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalTaxAmount() {
		return totalTaxAmount == null ? Optional.empty() : Optional.of(totalTaxAmount);
	}

	public ServiceCategoryTotals1 setTotalTaxAmount(ActiveCurrencyAndAmount totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
		return this;
	}

	public ActiveCurrencyAndAmount getTotalInvoiceAmount() {
		return totalInvoiceAmount;
	}

	public ServiceCategoryTotals1 setTotalInvoiceAmount(ActiveCurrencyAndAmount totalInvoiceAmount) {
		this.totalInvoiceAmount = Objects.requireNonNull(totalInvoiceAmount);
		return this;
	}

	public Max4AlphaNumericText getServiceCategory() {
		return serviceCategory;
	}

	public ServiceCategoryTotals1 setServiceCategory(Max4AlphaNumericText serviceCategory) {
		this.serviceCategory = Objects.requireNonNull(serviceCategory);
		return this;
	}

	public List<ServiceItemTotals1> getServiceItemTotals() {
		return serviceItemTotals == null ? serviceItemTotals = new ArrayList<>() : serviceItemTotals;
	}

	public ServiceCategoryTotals1 setServiceItemTotals(List<com.tools20022.repository.msg.ServiceItemTotals1> serviceItemTotals) {
		this.serviceItemTotals = Objects.requireNonNull(serviceItemTotals);
		return this;
	}
}