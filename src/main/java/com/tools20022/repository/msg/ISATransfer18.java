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
import com.tools20022.repository.area.sese.PortfolioTransferInstructionV06;
import com.tools20022.repository.choice.DateFormat1Choice;
import com.tools20022.repository.choice.ISAPortfolio1Choice;
import com.tools20022.repository.codeset.ResidualCash1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmMasterReference
 * ISATransfer18.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmTransferIdentification
 * ISATransfer18.mmTransferIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmTransferConfirmationIdentification
 * ISATransfer18.mmTransferConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmRequestedTransferDate
 * ISATransfer18.mmRequestedTransferDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer18#mmPortfolio
 * ISATransfer18.mmPortfolio}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer18#mmResidualCash
 * ISATransfer18.mmResidualCash}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer18#mmAllOtherCash
 * ISATransfer18.mmAllOtherCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmFinancialInstrumentAssetForTransfer
 * ISATransfer18.mmFinancialInstrumentAssetForTransfer}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV06#mmProductTransfer
 * PortfolioTransferInstructionV06.mmProductTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ISATransfer18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of product and the assets to be transferred."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ISATransfer16
 * ISATransfer16}</li>
 * </ul>
 */
public class ISATransfer18 {

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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18 ISATransfer18}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmMasterReference
	 * ISATransfer22.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#mmMasterReference
	 * ISATransfer16.mmMasterReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ISATransfer18.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer22.mmMasterReference);
			previousVersion_lazy = () -> ISATransfer16.mmMasterReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text transferIdentification;
	/**
	 * Identification assigned to the transfer of asset, typically assigned by
	 * the transferee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18 ISATransfer18}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmTransferIdentification
	 * ISATransfer22.mmTransferIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#mmTransferIdentification
	 * ISATransfer16.mmTransferIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ISATransfer18.mmObject();
			isDerived = false;
			xmlTag = "TrfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIdentification";
			definition = "Identification assigned to the transfer of asset, typically assigned by the transferee.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer22.mmTransferIdentification);
			previousVersion_lazy = () -> ISATransfer16.mmTransferIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text transferConfirmationIdentification;
	/**
	 * Identification of the confirmation assigned by the transferor to the
	 * transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18 ISATransfer18}</li>
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
	 * "Identification of the confirmation assigned by the transferor to the transfer. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmTransferConfirmationIdentification
	 * ISATransfer22.mmTransferConfirmationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#mmTransferConfirmationIdentification
	 * ISATransfer16.mmTransferConfirmationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferConfirmationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ISATransfer18.mmObject();
			isDerived = false;
			xmlTag = "TrfConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferConfirmationIdentification";
			definition = "Identification of the confirmation assigned by the transferor to the transfer. ";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer22.mmTransferConfirmationIdentification);
			previousVersion_lazy = () -> ISATransfer16.mmTransferConfirmationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateFormat1Choice requestedTransferDate;
	/**
	 * Requested date at which the assets should be transferred.
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
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferDate
	 * PortfolioTransfer.mmTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18 ISATransfer18}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmRequestedTransferDate
	 * ISATransfer22.mmRequestedTransferDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#mmRequestedTransferDate
	 * ISATransfer16.mmRequestedTransferDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedTransferDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferDate;
			componentContext_lazy = () -> ISATransfer18.mmObject();
			isDerived = false;
			xmlTag = "ReqdTrfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedTransferDate";
			definition = "Requested date at which the assets should be transferred.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer22.mmRequestedTransferDate);
			previousVersion_lazy = () -> ISATransfer16.mmRequestedTransferDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat1Choice.mmObject();
		}
	};
	protected ISAPortfolio1Choice portfolio;
	/**
	 * Specifies portfolio information or government schemes, for example
	 * Individual Savings Account (ISA) in the UK.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18 ISATransfer18}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer22#mmPortfolio
	 * ISATransfer22.mmPortfolio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#mmPortfolio
	 * ISATransfer16.mmPortfolio}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortfolio = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredPortfolio;
			componentContext_lazy = () -> ISATransfer18.mmObject();
			isDerived = false;
			xmlTag = "Prtfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Portfolio";
			definition = "Specifies portfolio information or government schemes, for example Individual Savings Account (ISA) in the UK.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer22.mmPortfolio);
			previousVersion_lazy = () -> ISATransfer16.mmPortfolio;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ISAPortfolio1Choice.mmObject();
		}
	};
	protected ResidualCash1Code residualCash;
	/**
	 * Indicates whether there is cash in the account that is awaiting
	 * investment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18 ISATransfer18}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmResidualCash
	 * ISATransfer22.mmResidualCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#mmResidualCash
	 * ISATransfer16.mmResidualCash}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResidualCash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ISATransfer18.mmObject();
			isDerived = false;
			xmlTag = "RsdlCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCash";
			definition = "Indicates whether there is cash in the account that is awaiting investment.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer22.mmResidualCash);
			previousVersion_lazy = () -> ISATransfer16.mmResidualCash;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ResidualCash1Code.mmObject();
		}
	};
	protected YesNoIndicator allOtherCash;
	/**
	 * Indicator that all remaining assets in a portfolio not listed for
	 * transfer should be liquidated and transferred as cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18 ISATransfer18}</li>
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
	 * "Indicator that all remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmAllOtherCash
	 * ISATransfer22.mmAllOtherCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#mmAllOtherCash
	 * ISATransfer16.mmAllOtherCash}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllOtherCash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ISATransfer18.mmObject();
			isDerived = false;
			xmlTag = "AllOthrCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOtherCash";
			definition = "Indicator that all remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer22.mmAllOtherCash);
			previousVersion_lazy = () -> ISATransfer16.mmAllOtherCash;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FinancialInstrument39> financialInstrumentAssetForTransfer;
	/**
	 * Specifies the underlying assets for the ISA or portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument39
	 * FinancialInstrument39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18 ISATransfer18}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmFinancialInstrumentAssetForTransfer
	 * ISATransfer22.mmFinancialInstrumentAssetForTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#mmFinancialInstrumentAssetForTransfer
	 * ISATransfer16.mmFinancialInstrumentAssetForTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentAssetForTransfer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> ISATransfer18.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAsstForTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAssetForTransfer";
			definition = "Specifies the underlying assets for the ISA or portfolio.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer22.mmFinancialInstrumentAssetForTransfer);
			previousVersion_lazy = () -> ISATransfer16.mmFinancialInstrumentAssetForTransfer;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument39.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ISATransfer18.mmMasterReference, ISATransfer18.mmTransferIdentification, ISATransfer18.mmTransferConfirmationIdentification, ISATransfer18.mmRequestedTransferDate,
						ISATransfer18.mmPortfolio, ISATransfer18.mmResidualCash, ISATransfer18.mmAllOtherCash, ISATransfer18.mmFinancialInstrumentAssetForTransfer);
				messageBuildingBlock_lazy = () -> Arrays.asList(PortfolioTransferInstructionV06.mmProductTransfer);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ISATransfer18";
				definition = "Describes the type of product and the assets to be transferred.";
				nextVersions_lazy = () -> Arrays.asList(ISATransfer22.mmObject());
				previousVersion_lazy = () -> ISATransfer16.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMasterReference() {
		return masterReference;
	}

	public void setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
	}

	public Max35Text getTransferIdentification() {
		return transferIdentification;
	}

	public void setTransferIdentification(Max35Text transferIdentification) {
		this.transferIdentification = transferIdentification;
	}

	public Max35Text getTransferConfirmationIdentification() {
		return transferConfirmationIdentification;
	}

	public void setTransferConfirmationIdentification(Max35Text transferConfirmationIdentification) {
		this.transferConfirmationIdentification = transferConfirmationIdentification;
	}

	public DateFormat1Choice getRequestedTransferDate() {
		return requestedTransferDate;
	}

	public void setRequestedTransferDate(DateFormat1Choice requestedTransferDate) {
		this.requestedTransferDate = requestedTransferDate;
	}

	public ISAPortfolio1Choice getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(ISAPortfolio1Choice portfolio) {
		this.portfolio = portfolio;
	}

	public ResidualCash1Code getResidualCash() {
		return residualCash;
	}

	public void setResidualCash(ResidualCash1Code residualCash) {
		this.residualCash = residualCash;
	}

	public YesNoIndicator getAllOtherCash() {
		return allOtherCash;
	}

	public void setAllOtherCash(YesNoIndicator allOtherCash) {
		this.allOtherCash = allOtherCash;
	}

	public List<FinancialInstrument39> getFinancialInstrumentAssetForTransfer() {
		return financialInstrumentAssetForTransfer;
	}

	public void setFinancialInstrumentAssetForTransfer(List<com.tools20022.repository.msg.FinancialInstrument39> financialInstrumentAssetForTransfer) {
		this.financialInstrumentAssetForTransfer = financialInstrumentAssetForTransfer;
	}
}