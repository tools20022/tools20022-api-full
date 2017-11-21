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
import com.tools20022.repository.choice.DateFormat1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters applied to the settlement of a security transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer6#mmMasterReference
 * Transfer6.mmMasterReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer6#mmTransferReference
 * Transfer6.mmTransferReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer6#mmClientReference
 * Transfer6.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer6#mmCancellationReference
 * Transfer6.mmCancellationReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer6#mmTransferDate
 * Transfer6.mmTransferDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer6#mmTotalUnitsNumber
 * Transfer6.mmTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer6#mmOwnAccountTransferIndicator
 * Transfer6.mmOwnAccountTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer6#mmNonStandardSettlementInformation
 * Transfer6.mmNonStandardSettlementInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
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
 * "Transfer6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security transfer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer16 Transfer16}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Transfer6", propOrder = {"masterReference", "transferReference", "clientReference", "cancellationReference", "transferDate", "totalUnitsNumber", "ownAccountTransferIndicator", "nonStandardSettlementInformation"})
public class Transfer6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text masterReference;
	/**
	 * Unique and unambiguous identifier for a group of individual transfers as
	 * assigned by the instructing party. This identifier links the individual
	 * transfers together.
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
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer6
	 * Transfer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> Transfer6.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text transferReference;
	/**
	 * Unique and unambiguous identifier for a transfer instruction, as assigned
	 * by the instructing party.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmIdentification
	 * SecuritiesTransfer.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer6
	 * Transfer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a transfer instruction, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmIdentification;
			componentContext_lazy = () -> Transfer6.mmObject();
			isDerived = false;
			xmlTag = "TrfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReference";
			definition = "Unique and unambiguous identifier for a transfer instruction, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientReference;
	/**
	 * Unique and unambiguous investor's identification of a transfer. This
	 * reference can typically be used in a hub scenario to give the reference
	 * of the transfer as assigned by the underlying client.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer6
	 * Transfer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> Transfer6.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text cancellationReference;
	/**
	 * Unique and unambiguous identifier for a transfer cancellation, as
	 * assigned by the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer6
	 * Transfer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a transfer cancellation, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Transfer6.mmObject();
			isDerived = false;
			xmlTag = "CxlRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReference";
			definition = "Unique and unambiguous identifier for a transfer cancellation, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateFormat1Choice transferDate;
	/**
	 * Date at which the instructing party places the transfer instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat1Choice
	 * DateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmTransferInstructionDate
	 * SecuritiesDeliveryObligation.mmTransferInstructionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer6
	 * Transfer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the instructing party places the transfer instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmTransferInstructionDate;
			componentContext_lazy = () -> Transfer6.mmObject();
			isDerived = false;
			xmlTag = "TrfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferDate";
			definition = "Date at which the instructing party places the transfer instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1 totalUnitsNumber;
	/**
	 * Total quantity of securities to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer6
	 * Transfer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities to be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> Transfer6.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumber";
			definition = "Total quantity of securities to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	protected YesNoIndicator ownAccountTransferIndicator;
	/**
	 * Indicates whether the transfer results in a change of beneficial owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmOwnAccountTransferIndicator
	 * SecuritiesTransfer.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer6
	 * Transfer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnAcctTrfInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnAccountTransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transfer results in a change of beneficial owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnAccountTransferIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmOwnAccountTransferIndicator;
			componentContext_lazy = () -> Transfer6.mmObject();
			isDerived = false;
			xmlTag = "OwnAcctTrfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnAccountTransferIndicator";
			definition = "Indicates whether the transfer results in a change of beneficial owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * Additional specific settlement information for non-regulated traded
	 * funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
	 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer6
	 * Transfer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdSttlmInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonStandardSettlementInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> Transfer6.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Transfer6.mmMasterReference, Transfer6.mmTransferReference, Transfer6.mmClientReference, Transfer6.mmCancellationReference, Transfer6.mmTransferDate, Transfer6.mmTotalUnitsNumber,
						Transfer6.mmOwnAccountTransferIndicator, Transfer6.mmNonStandardSettlementInformation);
				trace_lazy = () -> SecuritiesTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Transfer6";
				definition = "Parameters applied to the settlement of a security transfer.";
				nextVersions_lazy = () -> Arrays.asList(Transfer16.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MstrRef")
	public Max35Text getMasterReference() {
		return masterReference;
	}

	public void setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
	}

	@XmlElement(name = "TrfRef", required = true)
	public Max35Text getTransferReference() {
		return transferReference;
	}

	public void setTransferReference(Max35Text transferReference) {
		this.transferReference = transferReference;
	}

	@XmlElement(name = "ClntRef")
	public Max35Text getClientReference() {
		return clientReference;
	}

	public void setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
	}

	@XmlElement(name = "CxlRef")
	public Max35Text getCancellationReference() {
		return cancellationReference;
	}

	public void setCancellationReference(Max35Text cancellationReference) {
		this.cancellationReference = cancellationReference;
	}

	@XmlElement(name = "TrfDt")
	public DateFormat1Choice getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(DateFormat1Choice transferDate) {
		this.transferDate = transferDate;
	}

	@XmlElement(name = "TtlUnitsNb", required = true)
	public FinancialInstrumentQuantity1 getTotalUnitsNumber() {
		return totalUnitsNumber;
	}

	public void setTotalUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 totalUnitsNumber) {
		this.totalUnitsNumber = totalUnitsNumber;
	}

	@XmlElement(name = "OwnAcctTrfInd")
	public YesNoIndicator getOwnAccountTransferIndicator() {
		return ownAccountTransferIndicator;
	}

	public void setOwnAccountTransferIndicator(YesNoIndicator ownAccountTransferIndicator) {
		this.ownAccountTransferIndicator = ownAccountTransferIndicator;
	}

	@XmlElement(name = "NonStdSttlmInf")
	public Max350Text getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation;
	}

	public void setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
	}
}