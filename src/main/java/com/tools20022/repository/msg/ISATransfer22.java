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
import com.tools20022.repository.area.sese.PortfolioTransferInstructionV07;
import com.tools20022.repository.choice.DateFormat1Choice;
import com.tools20022.repository.choice.ISAPortfolio1Choice;
import com.tools20022.repository.codeset.AllOtherCash1Code;
import com.tools20022.repository.codeset.BusinessFlowType1Code;
import com.tools20022.repository.codeset.ResidualCash1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the type of product and the assets to be transferred.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmMasterReference
 * ISATransfer22.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmTransferIdentification
 * ISATransfer22.mmTransferIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmTransferConfirmationIdentification
 * ISATransfer22.mmTransferConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmClientReference
 * ISATransfer22.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmCounterpartyReference
 * ISATransfer22.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmBusinessFlowType
 * ISATransfer22.mmBusinessFlowType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmRequestedTransferDate
 * ISATransfer22.mmRequestedTransferDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer22#mmPortfolio
 * ISATransfer22.mmPortfolio}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer22#mmResidualCash
 * ISATransfer22.mmResidualCash}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer22#mmAllOtherCash
 * ISATransfer22.mmAllOtherCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmFinancialInstrumentAssetForTransfer
 * ISATransfer22.mmFinancialInstrumentAssetForTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmProductTransfer
 * PortfolioTransferInstructionV07.mmProductTransfer}</li>
 * </ul>
 * </li>
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
 * "ISATransfer22"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of product and the assets to be transferred."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer29 ISATransfer29}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ISATransfer18
 * ISATransfer18}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ISATransfer22", propOrder = {"masterReference", "transferIdentification", "transferConfirmationIdentification", "clientReference", "counterpartyReference", "businessFlowType", "requestedTransferDate", "portfolio",
		"residualCash", "allOtherCash", "financialInstrumentAssetForTransfer"})
public class ISATransfer22 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmMasterReference
	 * ISATransfer29.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmMasterReference
	 * ISATransfer18.mmMasterReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer22.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer29.mmMasterReference);
			previousVersion_lazy = () -> ISATransfer18.mmMasterReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TrfId", required = true)
	protected Max35Text transferIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to the transfer of asset, typically assigned by the transferee."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmTransferIdentification
	 * ISATransfer29.mmTransferIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmTransferIdentification
	 * ISATransfer18.mmTransferIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer22.mmObject();
			isDerived = false;
			xmlTag = "TrfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIdentification";
			definition = "Identification assigned to the transfer of asset, typically assigned by the transferee.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer29.mmTransferIdentification);
			previousVersion_lazy = () -> ISATransfer18.mmTransferIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TrfConfId")
	protected Max35Text transferConfirmationIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfConfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferConfirmationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the confirmation assigned by the transferor to the transfer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmTransferConfirmationIdentification
	 * ISATransfer29.mmTransferConfirmationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmTransferConfirmationIdentification
	 * ISATransfer18.mmTransferConfirmationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferConfirmationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer22.mmObject();
			isDerived = false;
			xmlTag = "TrfConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferConfirmationIdentification";
			definition = "Identification of the confirmation assigned by the transferor to the transfer.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer29.mmTransferConfirmationIdentification);
			previousVersion_lazy = () -> ISATransfer18.mmTransferConfirmationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ClntRef")
	protected AdditionalReference7 clientReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7
	 * AdditionalReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmClientReference
	 * ISATransfer29.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer22.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer29.mmClientReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdditionalReference7.mmObject();
		}
	};
	@XmlElement(name = "CtrPtyRef")
	protected AdditionalReference7 counterpartyReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7
	 * AdditionalReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
	 * TradeIdentification.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transfer allocated by the counterparty."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmCounterpartyReference
	 * ISATransfer29.mmCounterpartyReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer22.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the transfer allocated by the counterparty.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer29.mmCounterpartyReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdditionalReference7.mmObject();
		}
	};
	@XmlElement(name = "BizFlowTp")
	protected BusinessFlowType1Code businessFlowType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowType1Code
	 * BusinessFlowType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizFlowTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessFlowType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the business process in which the actors are involved. This is important to trigger the right business process, according to the market business model, which may require matching instructions in a CSD environment (double leg process) or not (single leg process)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmBusinessFlowType
	 * ISATransfer29.mmBusinessFlowType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBusinessFlowType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer22.mmObject();
			isDerived = false;
			xmlTag = "BizFlowTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessFlowType";
			definition = "Identifies the business process in which the actors are involved. This is important to trigger the right business process, according to the market business model, which may require matching instructions in a CSD environment (double leg process) or not (single leg process).";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer29.mmBusinessFlowType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BusinessFlowType1Code.mmObject();
		}
	};
	@XmlElement(name = "ReqdTrfDt")
	protected DateFormat1Choice requestedTransferDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferDate
	 * PortfolioTransfer.mmTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdTrfDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedTransferDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested date at which the assets should be transferred."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmRequestedTransferDate
	 * ISATransfer29.mmRequestedTransferDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmRequestedTransferDate
	 * ISATransfer18.mmRequestedTransferDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedTransferDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer22.mmObject();
			isDerived = false;
			xmlTag = "ReqdTrfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedTransferDate";
			definition = "Requested date at which the assets should be transferred.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer29.mmRequestedTransferDate);
			previousVersion_lazy = () -> ISATransfer18.mmRequestedTransferDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "Prtfl")
	protected ISAPortfolio1Choice portfolio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ISAPortfolio1Choice
	 * ISAPortfolio1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPortfolio
	 * PortfolioTransfer.mmTransferredPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies portfolio information or government schemes, for example Individual Savings Account (ISA) in the UK."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer29#mmPortfolio
	 * ISATransfer29.mmPortfolio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmPortfolio
	 * ISATransfer18.mmPortfolio}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortfolio = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredPortfolio;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer22.mmObject();
			isDerived = false;
			xmlTag = "Prtfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Portfolio";
			definition = "Specifies portfolio information or government schemes, for example Individual Savings Account (ISA) in the UK.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer29.mmPortfolio);
			previousVersion_lazy = () -> ISATransfer18.mmPortfolio;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ISAPortfolio1Choice.mmObject();
		}
	};
	@XmlElement(name = "RsdlCsh")
	protected ResidualCash1Code residualCash;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResidualCash1Code
	 * ResidualCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsdlCsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidualCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is cash in the account that is awaiting investment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmResidualCash
	 * ISATransfer29.mmResidualCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmResidualCash
	 * ISATransfer18.mmResidualCash}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResidualCash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer22.mmObject();
			isDerived = false;
			xmlTag = "RsdlCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCash";
			definition = "Indicates whether there is cash in the account that is awaiting investment.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer29.mmResidualCash);
			previousVersion_lazy = () -> ISATransfer18.mmResidualCash;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ResidualCash1Code.mmObject();
		}
	};
	@XmlElement(name = "AllOthrCsh")
	protected AllOtherCash1Code allOtherCash;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllOtherCash1Code
	 * AllOtherCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllOthrCsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOtherCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether all remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmAllOtherCash
	 * ISATransfer29.mmAllOtherCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmAllOtherCash
	 * ISATransfer18.mmAllOtherCash}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllOtherCash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer22.mmObject();
			isDerived = false;
			xmlTag = "AllOthrCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOtherCash";
			definition = "Specifies whether all remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer29.mmAllOtherCash);
			previousVersion_lazy = () -> ISATransfer18.mmAllOtherCash;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AllOtherCash1Code.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmAsstForTrf")
	protected List<com.tools20022.repository.msg.FinancialInstrument46> financialInstrumentAssetForTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument46
	 * FinancialInstrument46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAsstForTrf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAssetForTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying assets for the ISA or portfolio."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer29#mmFinancialInstrumentAssetForTransfer
	 * ISATransfer29.mmFinancialInstrumentAssetForTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmFinancialInstrumentAssetForTransfer
	 * ISATransfer18.mmFinancialInstrumentAssetForTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentAssetForTransfer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer22.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAsstForTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAssetForTransfer";
			definition = "Specifies the underlying assets for the ISA or portfolio.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer29.mmFinancialInstrumentAssetForTransfer);
			previousVersion_lazy = () -> ISATransfer18.mmFinancialInstrumentAssetForTransfer;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument46.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISATransfer22.mmMasterReference, com.tools20022.repository.msg.ISATransfer22.mmTransferIdentification,
						com.tools20022.repository.msg.ISATransfer22.mmTransferConfirmationIdentification, com.tools20022.repository.msg.ISATransfer22.mmClientReference, com.tools20022.repository.msg.ISATransfer22.mmCounterpartyReference,
						com.tools20022.repository.msg.ISATransfer22.mmBusinessFlowType, com.tools20022.repository.msg.ISATransfer22.mmRequestedTransferDate, com.tools20022.repository.msg.ISATransfer22.mmPortfolio,
						com.tools20022.repository.msg.ISATransfer22.mmResidualCash, com.tools20022.repository.msg.ISATransfer22.mmAllOtherCash, com.tools20022.repository.msg.ISATransfer22.mmFinancialInstrumentAssetForTransfer);
				messageBuildingBlock_lazy = () -> Arrays.asList(PortfolioTransferInstructionV07.mmProductTransfer);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ISATransfer22";
				definition = "Describes the type of product and the assets to be transferred.";
				nextVersions_lazy = () -> Arrays.asList(ISATransfer29.mmObject());
				previousVersion_lazy = () -> ISATransfer18.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public ISATransfer22 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Max35Text getTransferIdentification() {
		return transferIdentification;
	}

	public ISATransfer22 setTransferIdentification(Max35Text transferIdentification) {
		this.transferIdentification = Objects.requireNonNull(transferIdentification);
		return this;
	}

	public Optional<Max35Text> getTransferConfirmationIdentification() {
		return transferConfirmationIdentification == null ? Optional.empty() : Optional.of(transferConfirmationIdentification);
	}

	public ISATransfer22 setTransferConfirmationIdentification(Max35Text transferConfirmationIdentification) {
		this.transferConfirmationIdentification = transferConfirmationIdentification;
		return this;
	}

	public Optional<AdditionalReference7> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public ISATransfer22 setClientReference(com.tools20022.repository.msg.AdditionalReference7 clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<AdditionalReference7> getCounterpartyReference() {
		return counterpartyReference == null ? Optional.empty() : Optional.of(counterpartyReference);
	}

	public ISATransfer22 setCounterpartyReference(com.tools20022.repository.msg.AdditionalReference7 counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
		return this;
	}

	public Optional<BusinessFlowType1Code> getBusinessFlowType() {
		return businessFlowType == null ? Optional.empty() : Optional.of(businessFlowType);
	}

	public ISATransfer22 setBusinessFlowType(BusinessFlowType1Code businessFlowType) {
		this.businessFlowType = businessFlowType;
		return this;
	}

	public Optional<DateFormat1Choice> getRequestedTransferDate() {
		return requestedTransferDate == null ? Optional.empty() : Optional.of(requestedTransferDate);
	}

	public ISATransfer22 setRequestedTransferDate(DateFormat1Choice requestedTransferDate) {
		this.requestedTransferDate = requestedTransferDate;
		return this;
	}

	public Optional<ISAPortfolio1Choice> getPortfolio() {
		return portfolio == null ? Optional.empty() : Optional.of(portfolio);
	}

	public ISATransfer22 setPortfolio(ISAPortfolio1Choice portfolio) {
		this.portfolio = portfolio;
		return this;
	}

	public Optional<ResidualCash1Code> getResidualCash() {
		return residualCash == null ? Optional.empty() : Optional.of(residualCash);
	}

	public ISATransfer22 setResidualCash(ResidualCash1Code residualCash) {
		this.residualCash = residualCash;
		return this;
	}

	public Optional<AllOtherCash1Code> getAllOtherCash() {
		return allOtherCash == null ? Optional.empty() : Optional.of(allOtherCash);
	}

	public ISATransfer22 setAllOtherCash(AllOtherCash1Code allOtherCash) {
		this.allOtherCash = allOtherCash;
		return this;
	}

	public List<FinancialInstrument46> getFinancialInstrumentAssetForTransfer() {
		return financialInstrumentAssetForTransfer == null ? financialInstrumentAssetForTransfer = new ArrayList<>() : financialInstrumentAssetForTransfer;
	}

	public ISATransfer22 setFinancialInstrumentAssetForTransfer(List<com.tools20022.repository.msg.FinancialInstrument46> financialInstrumentAssetForTransfer) {
		this.financialInstrumentAssetForTransfer = Objects.requireNonNull(financialInstrumentAssetForTransfer);
		return this;
	}
}