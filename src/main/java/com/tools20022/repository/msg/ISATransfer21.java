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
import com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06;
import com.tools20022.repository.choice.ISAPortfolio2Choice;
import com.tools20022.repository.codeset.ResidualCash1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrument40;
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
 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmMasterReference
 * ISATransfer21.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmTransferConfirmationIdentification
 * ISATransfer21.mmTransferConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmTransferInstructionReference
 * ISATransfer21.mmTransferInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmActualTransferDate
 * ISATransfer21.mmActualTransferDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer21#mmResidualCash
 * ISATransfer21.mmResidualCash}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer21#mmPortfolio
 * ISATransfer21.mmPortfolio}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer21#mmAllOtherCash
 * ISATransfer21.mmAllOtherCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmFinancialInstrumentAssetForTransfer
 * ISATransfer21.mmFinancialInstrumentAssetForTransfer}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV06#mmProductTransfer
 * PortfolioTransferConfirmationV06.mmProductTransfer}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ISATransfer21"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of product and the assets to be transferred."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer26 ISATransfer26}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ISATransfer13
 * ISATransfer13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ISATransfer21", propOrder = {"masterReference", "transferConfirmationIdentification", "transferInstructionReference", "actualTransferDate", "residualCash", "portfolio", "allOtherCash", "financialInstrumentAssetForTransfer"})
public class ISATransfer21 {

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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21 ISATransfer21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmMasterReference
	 * ISATransfer26.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmMasterReference
	 * ISATransfer13.mmMasterReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ISATransfer21, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<ISATransfer21, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer21.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer26.mmMasterReference);
			previousVersion_lazy = () -> ISATransfer13.mmMasterReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ISATransfer21 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(ISATransfer21 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21 ISATransfer21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmTransferConfirmationIdentification
	 * ISATransfer26.mmTransferConfirmationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmTransferConfirmationIdentification
	 * ISATransfer13.mmTransferConfirmationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ISATransfer21, Max35Text> mmTransferConfirmationIdentification = new MMMessageAttribute<ISATransfer21, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer21.mmObject();
			isDerived = false;
			xmlTag = "TrfConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferConfirmationIdentification";
			definition = "Identification of the confirmation assigned by the transferor to the transfer.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer26.mmTransferConfirmationIdentification);
			previousVersion_lazy = () -> ISATransfer13.mmTransferConfirmationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ISATransfer21 obj) {
			return obj.getTransferConfirmationIdentification();
		}

		@Override
		public void setValue(ISATransfer21 obj, Max35Text value) {
			obj.setTransferConfirmationIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21 ISATransfer21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmTransferInstructionReference
	 * ISATransfer26.mmTransferInstructionReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmTransferInstructionReference
	 * ISATransfer13.mmTransferInstructionReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ISATransfer21, Max35Text> mmTransferInstructionReference = new MMMessageAttribute<ISATransfer21, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer21.mmObject();
			isDerived = false;
			xmlTag = "TrfInstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferInstructionReference";
			definition = "Identification assigned to the transfer of asset, typically assigned by the transferee.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer26.mmTransferInstructionReference);
			previousVersion_lazy = () -> ISATransfer13.mmTransferInstructionReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ISATransfer21 obj) {
			return obj.getTransferInstructionReference();
		}

		@Override
		public void setValue(ISATransfer21 obj, Max35Text value) {
			obj.setTransferInstructionReference(value);
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21 ISATransfer21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmActualTransferDate
	 * ISATransfer26.mmActualTransferDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmActualTransferDate
	 * ISATransfer13.mmActualTransferDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ISATransfer21, Optional<ISODate>> mmActualTransferDate = new MMMessageAttribute<ISATransfer21, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer21.mmObject();
			isDerived = false;
			xmlTag = "ActlTrfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualTransferDate";
			definition = "Date when the transfer instruction was executed.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer26.mmActualTransferDate);
			previousVersion_lazy = () -> ISATransfer13.mmActualTransferDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ISATransfer21 obj) {
			return obj.getActualTransferDate();
		}

		@Override
		public void setValue(ISATransfer21 obj, Optional<ISODate> value) {
			obj.setActualTransferDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21 ISATransfer21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmResidualCash
	 * ISATransfer26.mmResidualCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmResidualCash
	 * ISATransfer13.mmResidualCash}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ISATransfer21, Optional<ResidualCash1Code>> mmResidualCash = new MMMessageAttribute<ISATransfer21, Optional<ResidualCash1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer21.mmObject();
			isDerived = false;
			xmlTag = "RsdlCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCash";
			definition = "Indicates whether there is cash in the account that is awaiting investment.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer26.mmResidualCash);
			previousVersion_lazy = () -> ISATransfer13.mmResidualCash;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ResidualCash1Code.mmObject();
		}

		@Override
		public Optional<ResidualCash1Code> getValue(ISATransfer21 obj) {
			return obj.getResidualCash();
		}

		@Override
		public void setValue(ISATransfer21 obj, Optional<ResidualCash1Code> value) {
			obj.setResidualCash(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21 ISATransfer21}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer26#mmPortfolio
	 * ISATransfer26.mmPortfolio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmPortfolio
	 * ISATransfer13.mmPortfolio}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ISATransfer21, Optional<ISAPortfolio2Choice>> mmPortfolio = new MMMessageAssociationEnd<ISATransfer21, Optional<ISAPortfolio2Choice>>() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredPortfolio;
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer21.mmObject();
			isDerived = false;
			xmlTag = "Prtfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Portfolio";
			definition = "Specifies portfolio information or government schemes, for example Individual Savings Account (ISA) in the UK.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer26.mmPortfolio);
			previousVersion_lazy = () -> ISATransfer13.mmPortfolio;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ISAPortfolio2Choice.mmObject();
		}

		@Override
		public Optional<ISAPortfolio2Choice> getValue(ISATransfer21 obj) {
			return obj.getPortfolio();
		}

		@Override
		public void setValue(ISATransfer21 obj, Optional<ISAPortfolio2Choice> value) {
			obj.setPortfolio(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21 ISATransfer21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmAllOtherCash
	 * ISATransfer26.mmAllOtherCash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmAllOtherCash
	 * ISATransfer13.mmAllOtherCash}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ISATransfer21, YesNoIndicator> mmAllOtherCash = new MMMessageAttribute<ISATransfer21, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer21.mmObject();
			isDerived = false;
			xmlTag = "AllOthrCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOtherCash";
			definition = "Indicator that all remaining assets in a portfolio not listed for transfer should be liquidated and transferred as cash.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer26.mmAllOtherCash);
			previousVersion_lazy = () -> ISATransfer13.mmAllOtherCash;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(ISATransfer21 obj) {
			return obj.getAllOtherCash();
		}

		@Override
		public void setValue(ISATransfer21 obj, YesNoIndicator value) {
			obj.setAllOtherCash(value);
		}
	};
	@XmlElement(name = "FinInstrmAsstForTrf")
	protected List<FinancialInstrument40> financialInstrumentAssetForTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument40
	 * FinancialInstrument40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21 ISATransfer21}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmFinancialInstrumentAssetForTransfer
	 * ISATransfer26.mmFinancialInstrumentAssetForTransfer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmFinancialInstrumentAssetForTransfer
	 * ISATransfer13.mmFinancialInstrumentAssetForTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ISATransfer21, List<FinancialInstrument40>> mmFinancialInstrumentAssetForTransfer = new MMMessageAssociationEnd<ISATransfer21, List<FinancialInstrument40>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ISATransfer21.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAsstForTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAssetForTransfer";
			definition = "Specifies the underlying assets for the ISA or portfolio.";
			nextVersions_lazy = () -> Arrays.asList(ISATransfer26.mmFinancialInstrumentAssetForTransfer);
			previousVersion_lazy = () -> ISATransfer13.mmFinancialInstrumentAssetForTransfer;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrument40.mmObject();
		}

		@Override
		public List<FinancialInstrument40> getValue(ISATransfer21 obj) {
			return obj.getFinancialInstrumentAssetForTransfer();
		}

		@Override
		public void setValue(ISATransfer21 obj, List<FinancialInstrument40> value) {
			obj.setFinancialInstrumentAssetForTransfer(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISATransfer21.mmMasterReference, com.tools20022.repository.msg.ISATransfer21.mmTransferConfirmationIdentification,
						com.tools20022.repository.msg.ISATransfer21.mmTransferInstructionReference, com.tools20022.repository.msg.ISATransfer21.mmActualTransferDate, com.tools20022.repository.msg.ISATransfer21.mmResidualCash,
						com.tools20022.repository.msg.ISATransfer21.mmPortfolio, com.tools20022.repository.msg.ISATransfer21.mmAllOtherCash, com.tools20022.repository.msg.ISATransfer21.mmFinancialInstrumentAssetForTransfer);
				messageBuildingBlock_lazy = () -> Arrays.asList(PortfolioTransferConfirmationV06.mmProductTransfer);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ISATransfer21";
				definition = "Describes the type of product and the assets to be transferred.";
				nextVersions_lazy = () -> Arrays.asList(ISATransfer26.mmObject());
				previousVersion_lazy = () -> ISATransfer13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public ISATransfer21 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Max35Text getTransferConfirmationIdentification() {
		return transferConfirmationIdentification;
	}

	public ISATransfer21 setTransferConfirmationIdentification(Max35Text transferConfirmationIdentification) {
		this.transferConfirmationIdentification = Objects.requireNonNull(transferConfirmationIdentification);
		return this;
	}

	public Max35Text getTransferInstructionReference() {
		return transferInstructionReference;
	}

	public ISATransfer21 setTransferInstructionReference(Max35Text transferInstructionReference) {
		this.transferInstructionReference = Objects.requireNonNull(transferInstructionReference);
		return this;
	}

	public Optional<ISODate> getActualTransferDate() {
		return actualTransferDate == null ? Optional.empty() : Optional.of(actualTransferDate);
	}

	public ISATransfer21 setActualTransferDate(ISODate actualTransferDate) {
		this.actualTransferDate = actualTransferDate;
		return this;
	}

	public Optional<ResidualCash1Code> getResidualCash() {
		return residualCash == null ? Optional.empty() : Optional.of(residualCash);
	}

	public ISATransfer21 setResidualCash(ResidualCash1Code residualCash) {
		this.residualCash = residualCash;
		return this;
	}

	public Optional<ISAPortfolio2Choice> getPortfolio() {
		return portfolio == null ? Optional.empty() : Optional.of(portfolio);
	}

	public ISATransfer21 setPortfolio(ISAPortfolio2Choice portfolio) {
		this.portfolio = portfolio;
		return this;
	}

	public YesNoIndicator getAllOtherCash() {
		return allOtherCash;
	}

	public ISATransfer21 setAllOtherCash(YesNoIndicator allOtherCash) {
		this.allOtherCash = Objects.requireNonNull(allOtherCash);
		return this;
	}

	public List<FinancialInstrument40> getFinancialInstrumentAssetForTransfer() {
		return financialInstrumentAssetForTransfer == null ? financialInstrumentAssetForTransfer = new ArrayList<>() : financialInstrumentAssetForTransfer;
	}

	public ISATransfer21 setFinancialInstrumentAssetForTransfer(List<FinancialInstrument40> financialInstrumentAssetForTransfer) {
		this.financialInstrumentAssetForTransfer = Objects.requireNonNull(financialInstrumentAssetForTransfer);
		return this;
	}
}