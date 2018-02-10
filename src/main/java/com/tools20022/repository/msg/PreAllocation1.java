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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Allocation;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides pre-allocation details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreAllocation1#mmAllocationIdentification
 * PreAllocation1.mmAllocationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreAllocation1#mmIndividualAllocationIdentification
 * PreAllocation1.mmIndividualAllocationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreAllocation1#mmAllocatedQuantity
 * PreAllocation1.mmAllocatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreAllocation1#mmAllocatedSettlementCurrency
 * PreAllocation1.mmAllocatedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreAllocation1#mmAllocationAccountDetails
 * PreAllocation1.mmAllocationAccountDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Allocation Allocation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PreAllocation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides pre-allocation details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PreAllocation1", propOrder = {"allocationIdentification", "individualAllocationIdentification", "allocatedQuantity", "allocatedSettlementCurrency", "allocationAccountDetails"})
public class PreAllocation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AllcnId")
	protected Max35Text allocationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PreAllocation1 PreAllocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllcnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 70</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to assign an identifier to the block of preallocations."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllocationIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> GenericIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PreAllocation1.mmObject();
			isDerived = false;
			xmlTag = "AllcnId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "70"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationIdentification";
			definition = "Used to assign an identifier to the block of preallocations.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "IndvAllcnId")
	protected Max35Text individualAllocationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PreAllocation1 PreAllocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvAllcnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 467</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualAllocationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A unique identification for each allocation instance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndividualAllocationIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> GenericIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PreAllocation1.mmObject();
			isDerived = false;
			xmlTag = "IndvAllcnId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "467"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualAllocationIdentification";
			definition = "A unique identification for each allocation instance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "AllctdQty")
	protected FinancialInstrumentQuantityChoice allocatedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedQuantity
	 * Allocation.mmAllocatedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PreAllocation1 PreAllocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllctdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 80</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocatedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of a specific security allocated from a block trade, based upon the distribution of the trade to different accounts."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllocatedQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Allocation.mmAllocatedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.PreAllocation1.mmObject();
			isDerived = false;
			xmlTag = "AllctdQty";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "80"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocatedQuantity";
			definition = "Quantity of a specific security allocated from a block trade, based upon the distribution of the trade to different accounts.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}
	};
	@XmlElement(name = "AllctdSttlmCcy")
	protected CurrencyCode allocatedSettlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmSettlementCurrency
	 * Allocation.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PreAllocation1 PreAllocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllctdSttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 736</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocatedSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency to be used for settlement of the settlement amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllocatedSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Allocation.mmSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.PreAllocation1.mmObject();
			isDerived = false;
			xmlTag = "AllctdSttlmCcy";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "736"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocatedSettlementCurrency";
			definition = "Currency to be used for settlement of the settlement amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "AllcnAcctDtls")
	protected SecuritiesAccount2 allocationAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount2
	 * SecuritiesAccount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocationAccount
	 * Allocation.mmAllocationAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PreAllocation1 PreAllocation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllcnAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 79, FIXSynonym: 661</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which an allocation must be made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAllocationAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Allocation.mmAllocationAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PreAllocation1.mmObject();
			isDerived = false;
			xmlTag = "AllcnAcctDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "79"), new FIXSynonym(this, "661"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationAccountDetails";
			definition = "Account to or from which an allocation must be made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesAccount2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PreAllocation1.mmAllocationIdentification, com.tools20022.repository.msg.PreAllocation1.mmIndividualAllocationIdentification,
						com.tools20022.repository.msg.PreAllocation1.mmAllocatedQuantity, com.tools20022.repository.msg.PreAllocation1.mmAllocatedSettlementCurrency, com.tools20022.repository.msg.PreAllocation1.mmAllocationAccountDetails);
				trace_lazy = () -> Allocation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PreAllocation1";
				definition = "Provides pre-allocation details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getAllocationIdentification() {
		return allocationIdentification == null ? Optional.empty() : Optional.of(allocationIdentification);
	}

	public PreAllocation1 setAllocationIdentification(Max35Text allocationIdentification) {
		this.allocationIdentification = allocationIdentification;
		return this;
	}

	public Optional<Max35Text> getIndividualAllocationIdentification() {
		return individualAllocationIdentification == null ? Optional.empty() : Optional.of(individualAllocationIdentification);
	}

	public PreAllocation1 setIndividualAllocationIdentification(Max35Text individualAllocationIdentification) {
		this.individualAllocationIdentification = individualAllocationIdentification;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getAllocatedQuantity() {
		return allocatedQuantity == null ? Optional.empty() : Optional.of(allocatedQuantity);
	}

	public PreAllocation1 setAllocatedQuantity(FinancialInstrumentQuantityChoice allocatedQuantity) {
		this.allocatedQuantity = allocatedQuantity;
		return this;
	}

	public Optional<CurrencyCode> getAllocatedSettlementCurrency() {
		return allocatedSettlementCurrency == null ? Optional.empty() : Optional.of(allocatedSettlementCurrency);
	}

	public PreAllocation1 setAllocatedSettlementCurrency(CurrencyCode allocatedSettlementCurrency) {
		this.allocatedSettlementCurrency = allocatedSettlementCurrency;
		return this;
	}

	public Optional<SecuritiesAccount2> getAllocationAccountDetails() {
		return allocationAccountDetails == null ? Optional.empty() : Optional.of(allocationAccountDetails);
	}

	public PreAllocation1 setAllocationAccountDetails(com.tools20022.repository.msg.SecuritiesAccount2 allocationAccountDetails) {
		this.allocationAccountDetails = allocationAccountDetails;
		return this;
	}
}