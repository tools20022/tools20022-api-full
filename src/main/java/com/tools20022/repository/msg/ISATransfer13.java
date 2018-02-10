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
import com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05;
import com.tools20022.repository.choice.ISAPortfolio2Choice;
import com.tools20022.repository.codeset.ResidualCash1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.entity.PortfolioTransfer;
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
 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmMasterReference
 * ISATransfer13.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmTransferConfirmationIdentification
 * ISATransfer13.mmTransferConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmTransferInstructionReference
 * ISATransfer13.mmTransferInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmActualTransferDate
 * ISATransfer13.mmActualTransferDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer13#mmResidualCash
 * ISATransfer13.mmResidualCash}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer13#mmPortfolio
 * ISATransfer13.mmPortfolio}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer13#mmAllOtherCash
 * ISATransfer13.mmAllOtherCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmFinancialInstrumentAssetForTransfer
 * ISATransfer13.mmFinancialInstrumentAssetForTransfer}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV05#mmProductTransfer
 * PortfolioTransferConfirmationV05.mmProductTransfer}</li>
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
 * "ISATransfer13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of product and the assets to be transferred."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer21 ISATransfer21}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ISATransfer10
 * ISATransfer10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ISATransfer13", propOrder = {"masterReference", "transferConfirmationIdentification", "transferInstructionReference", "actualTransferDate", "residualCash", "portfolio", "allOtherCash", "financialInstrumentAssetForTransfer"})
public class ISATransfer13 {

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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13 ISATransfer13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmMasterReference
	 * ISATransfer21.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#mmMasterReference
	 * ISATransfer10.mmMasterReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer13.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer21.mmMasterReference);
			previousVersion_lazy = () -> ISATransfer10.mmMasterReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TrfConfId", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13 ISATransfer13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmTransferConfirmationIdentification
	 * ISATransfer21.mmTransferConfirmationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#mmTransferConfirmationIdentification
	 * ISATransfer10.mmTransferConfirmationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferConfirmationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer13.mmObject();
			isDerived = false;
			xmlTag = "TrfConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferConfirmationIdentification";
			definition = "Identification of the confirmation assigned by the transferor to the transfer.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer21.mmTransferConfirmationIdentification);
			previousVersion_lazy = () -> ISATransfer10.mmTransferConfirmationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TrfInstrRef", required = true)
	protected Max35Text transferInstructionReference;
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13 ISATransfer13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfInstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferInstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to the transfer of asset, typically assigned by the transferee."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmTransferInstructionReference
	 * ISATransfer21.mmTransferInstructionReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#mmTransferInstructionReference
	 * ISATransfer10.mmTransferInstructionReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferInstructionReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer13.mmObject();
			isDerived = false;
			xmlTag = "TrfInstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferInstructionReference";
			definition = "Identification assigned to the transfer of asset, typically assigned by the transferee.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer21.mmTransferInstructionReference);
			previousVersion_lazy = () -> ISATransfer10.mmTransferInstructionReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ActlTrfDt")
	protected ISODate actualTransferDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferDate
	 * PortfolioTransfer.mmTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13 ISATransfer13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlTrfDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualTransferDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the transfer instruction was executed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmActualTransferDate
	 * ISATransfer21.mmActualTransferDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#mmActualTransferDate
	 * ISATransfer10.mmActualTransferDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActualTransferDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer13.mmObject();
			isDerived = false;
			xmlTag = "ActlTrfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualTransferDate";
			definition = "Date when the transfer instruction was executed.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer21.mmActualTransferDate);
			previousVersion_lazy = () -> ISATransfer10.mmActualTransferDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13 ISATransfer13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmResidualCash
	 * ISATransfer21.mmResidualCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#mmResidualCash
	 * ISATransfer10.mmResidualCash}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResidualCash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer13.mmObject();
			isDerived = false;
			xmlTag = "RsdlCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCash";
			definition = "Indicates whether there is cash in the account that is awaiting investment.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer21.mmResidualCash);
			previousVersion_lazy = () -> ISATransfer10.mmResidualCash;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ResidualCash1Code.mmObject();
		}
	};
	@XmlElement(name = "Prtfl")
	protected ISAPortfolio2Choice portfolio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ISAPortfolio2Choice
	 * ISAPortfolio2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPortfolio
	 * PortfolioTransfer.mmTransferredPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13 ISATransfer13}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer21#mmPortfolio
	 * ISATransfer21.mmPortfolio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#mmPortfolio
	 * ISATransfer10.mmPortfolio}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPortfolio = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredPortfolio;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer13.mmObject();
			isDerived = false;
			xmlTag = "Prtfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Portfolio";
			definition = "Specifies portfolio information or government schemes, for example Individual Savings Account (ISA) in the UK.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer21.mmPortfolio);
			previousVersion_lazy = () -> ISATransfer10.mmPortfolio;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ISAPortfolio2Choice.mmObject();
		}
	};
	@XmlElement(name = "AllOthrCsh", required = true)
	protected YesNoIndicator allOtherCash;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13 ISATransfer13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmAllOtherCash
	 * ISATransfer21.mmAllOtherCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#mmAllOtherCash
	 * ISATransfer10.mmAllOtherCash}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllOtherCash = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer13.mmObject();
			isDerived = false;
			xmlTag = "AllOthrCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOtherCash";
			definition = "Indicator that all remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer21.mmAllOtherCash);
			previousVersion_lazy = () -> ISATransfer10.mmAllOtherCash;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmAsstForTrf")
	protected List<com.tools20022.repository.msg.FinancialInstrument35> financialInstrumentAssetForTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument35
	 * FinancialInstrument35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13 ISATransfer13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmFinancialInstrumentAssetForTransfer
	 * ISATransfer21.mmFinancialInstrumentAssetForTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#mmFinancialInstrumentAssetForTransfer
	 * ISATransfer10.mmFinancialInstrumentAssetForTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentAssetForTransfer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer13.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAsstForTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAssetForTransfer";
			definition = "Specifies the underlying assets for the ISA or portfolio.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer21.mmFinancialInstrumentAssetForTransfer);
			previousVersion_lazy = () -> ISATransfer10.mmFinancialInstrumentAssetForTransfer;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument35.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISATransfer13.mmMasterReference, com.tools20022.repository.msg.ISATransfer13.mmTransferConfirmationIdentification,
						com.tools20022.repository.msg.ISATransfer13.mmTransferInstructionReference, com.tools20022.repository.msg.ISATransfer13.mmActualTransferDate, com.tools20022.repository.msg.ISATransfer13.mmResidualCash,
						com.tools20022.repository.msg.ISATransfer13.mmPortfolio, com.tools20022.repository.msg.ISATransfer13.mmAllOtherCash, com.tools20022.repository.msg.ISATransfer13.mmFinancialInstrumentAssetForTransfer);
				messageBuildingBlock_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV05.mmProductTransfer);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ISATransfer13";
				definition = "Describes the type of product and the assets to be transferred.";
				nextVersions_lazy = () -> Arrays.asList(ISATransfer21.mmObject());
				previousVersion_lazy = () -> ISATransfer10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public ISATransfer13 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Max35Text getTransferConfirmationIdentification() {
		return transferConfirmationIdentification;
	}

	public ISATransfer13 setTransferConfirmationIdentification(Max35Text transferConfirmationIdentification) {
		this.transferConfirmationIdentification = Objects.requireNonNull(transferConfirmationIdentification);
		return this;
	}

	public Max35Text getTransferInstructionReference() {
		return transferInstructionReference;
	}

	public ISATransfer13 setTransferInstructionReference(Max35Text transferInstructionReference) {
		this.transferInstructionReference = Objects.requireNonNull(transferInstructionReference);
		return this;
	}

	public Optional<ISODate> getActualTransferDate() {
		return actualTransferDate == null ? Optional.empty() : Optional.of(actualTransferDate);
	}

	public ISATransfer13 setActualTransferDate(ISODate actualTransferDate) {
		this.actualTransferDate = actualTransferDate;
		return this;
	}

	public Optional<ResidualCash1Code> getResidualCash() {
		return residualCash == null ? Optional.empty() : Optional.of(residualCash);
	}

	public ISATransfer13 setResidualCash(ResidualCash1Code residualCash) {
		this.residualCash = residualCash;
		return this;
	}

	public Optional<ISAPortfolio2Choice> getPortfolio() {
		return portfolio == null ? Optional.empty() : Optional.of(portfolio);
	}

	public ISATransfer13 setPortfolio(ISAPortfolio2Choice portfolio) {
		this.portfolio = portfolio;
		return this;
	}

	public YesNoIndicator getAllOtherCash() {
		return allOtherCash;
	}

	public ISATransfer13 setAllOtherCash(YesNoIndicator allOtherCash) {
		this.allOtherCash = Objects.requireNonNull(allOtherCash);
		return this;
	}

	public List<FinancialInstrument35> getFinancialInstrumentAssetForTransfer() {
		return financialInstrumentAssetForTransfer == null ? financialInstrumentAssetForTransfer = new ArrayList<>() : financialInstrumentAssetForTransfer;
	}

	public ISATransfer13 setFinancialInstrumentAssetForTransfer(List<com.tools20022.repository.msg.FinancialInstrument35> financialInstrumentAssetForTransfer) {
		this.financialInstrumentAssetForTransfer = Objects.requireNonNull(financialInstrumentAssetForTransfer);
		return this;
	}
}