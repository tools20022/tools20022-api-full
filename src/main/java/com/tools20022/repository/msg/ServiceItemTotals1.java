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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * <li>{@linkplain com.tools20022.repository.msg.ServiceItemTotals1#mmItemType
 * ServiceItemTotals1.mmItemType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceItemTotals1#mmQuantity
 * ServiceItemTotals1.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceItemTotals1#mmUnitPrice
 * ServiceItemTotals1.mmUnitPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1#mmTotalTaxableAmount
 * ServiceItemTotals1.mmTotalTaxableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1#mmTotalTaxAmount
 * ServiceItemTotals1.mmTotalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1#mmTotalInvoiceAmount
 * ServiceItemTotals1.mmTotalInvoiceAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
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
 * "ServiceItemTotals1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies totals related to the invoice."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ServiceItemTotals1", propOrder = {"itemType", "quantity", "unitPrice", "totalTaxableAmount", "totalTaxAmount", "totalInvoiceAmount"})
public class ServiceItemTotals1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ItmTp", required = true)
	protected Max4AlphaNumericText itemType;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory#mmType
	 * ProductCategory.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1
	 * ServiceItemTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a classification for the service items such as  query, report, securities account, etc…"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmItemType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductCategory.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceItemTotals1.mmObject();
			isDerived = false;
			xmlTag = "ItmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemType";
			definition = "Specifies a classification for the service items such as  query, report, securities account, etc…";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	@XmlElement(name = "Qty", required = true)
	protected Number quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmValue
	 * ProductQuantity.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1
	 * ServiceItemTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sum of total number units per service item."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceItemTotals1.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Sum of total number units per service item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "UnitPric")
	protected ActiveCurrencyAndAmount unitPrice;
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
	 * {@linkplain com.tools20022.repository.entity.Price#mmAmount
	 * Price.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1
	 * ServiceItemTotals1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the unit of the service item."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Price.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceItemTotals1.mmObject();
			isDerived = false;
			xmlTag = "UnitPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitPrice";
			definition = "Specifies the unit of the service item.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1
	 * ServiceItemTotals1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceItemTotals1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1
	 * ServiceItemTotals1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceItemTotals1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1
	 * ServiceItemTotals1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.ServiceItemTotals1.mmObject();
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

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ServiceItemTotals1.mmItemType, com.tools20022.repository.msg.ServiceItemTotals1.mmQuantity,
						com.tools20022.repository.msg.ServiceItemTotals1.mmUnitPrice, com.tools20022.repository.msg.ServiceItemTotals1.mmTotalTaxableAmount, com.tools20022.repository.msg.ServiceItemTotals1.mmTotalTaxAmount,
						com.tools20022.repository.msg.ServiceItemTotals1.mmTotalInvoiceAmount);
				trace_lazy = () -> Product.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ServiceItemTotals1";
				definition = "Specifies totals related to the invoice.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max4AlphaNumericText getItemType() {
		return itemType;
	}

	public ServiceItemTotals1 setItemType(Max4AlphaNumericText itemType) {
		this.itemType = Objects.requireNonNull(itemType);
		return this;
	}

	public Number getQuantity() {
		return quantity;
	}

	public ServiceItemTotals1 setQuantity(Number quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getUnitPrice() {
		return unitPrice == null ? Optional.empty() : Optional.of(unitPrice);
	}

	public ServiceItemTotals1 setUnitPrice(ActiveCurrencyAndAmount unitPrice) {
		this.unitPrice = unitPrice;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalTaxableAmount() {
		return totalTaxableAmount == null ? Optional.empty() : Optional.of(totalTaxableAmount);
	}

	public ServiceItemTotals1 setTotalTaxableAmount(ActiveCurrencyAndAmount totalTaxableAmount) {
		this.totalTaxableAmount = totalTaxableAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalTaxAmount() {
		return totalTaxAmount == null ? Optional.empty() : Optional.of(totalTaxAmount);
	}

	public ServiceItemTotals1 setTotalTaxAmount(ActiveCurrencyAndAmount totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
		return this;
	}

	public ActiveCurrencyAndAmount getTotalInvoiceAmount() {
		return totalInvoiceAmount;
	}

	public ServiceItemTotals1 setTotalInvoiceAmount(ActiveCurrencyAndAmount totalInvoiceAmount) {
		this.totalInvoiceAmount = Objects.requireNonNull(totalInvoiceAmount);
		return this;
	}
}