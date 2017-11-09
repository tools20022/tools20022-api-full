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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02;
import com.tools20022.repository.choice.PreviousYearChoice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.Order;
import com.tools20022.repository.entity.PortfolioTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;

/**
 * Describes the type of product and the assets to be transferred.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmProductRule
 * PEPISATransfer4.mmProductRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmMasterReference
 * PEPISATransfer4.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmTransferConfirmationIdentification
 * PEPISATransfer4.mmTransferConfirmationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmTransferInstructionReference
 * PEPISATransfer4.mmTransferInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmActualTransferDate
 * PEPISATransfer4.mmActualTransferDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmResidualCashIndicator
 * PEPISATransfer4.mmResidualCashIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmISA
 * PEPISATransfer4.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmPEP
 * PEPISATransfer4.mmPEP}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmPortfolio
 * PEPISATransfer4.mmPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmFinancialInstrumentAssetForTransfer
 * PEPISATransfer4.mmFinancialInstrumentAssetForTransfer}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.PEPOrISAOrPortfolioTransferConfirmationV02#mmProductTransfer
 * PEPOrISAOrPortfolioTransferConfirmationV02.mmProductTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PEPISATransfer4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of product and the assets to be transferred."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class PEPISATransfer4 {

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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4
	 * PEPISATransfer4}</li>
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
			componentContext_lazy = () -> PEPISATransfer4.mmObject();
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
	protected Max35Text transferConfirmationIdentification;
	/**
	 * Identification of the confirmation assigned by the old plan manager to
	 * the transfer of account.
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
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4
	 * PEPISATransfer4}</li>
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
	 * "Identification of the confirmation assigned by the old plan manager to the transfer of account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferConfirmationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PEPISATransfer4.mmObject();
			isDerived = false;
			xmlTag = "TrfConfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferConfirmationIdentification";
			definition = "Identification of the confirmation assigned by the old plan manager to the transfer of account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text transferInstructionReference;
	/**
	 * Identification received by the old plan manager and assigned by the new
	 * plan manager to the transfer of account.
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
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4
	 * PEPISATransfer4}</li>
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
	 * "Identification received by the old plan manager and assigned by the new plan manager to the transfer of account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferInstructionReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PEPISATransfer4.mmObject();
			isDerived = false;
			xmlTag = "TrfInstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferInstructionReference";
			definition = "Identification received by the old plan manager and assigned by the new plan manager to the transfer of account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODate actualTransferDate;
	/**
	 * Date when the transfer instruction was executed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4
	 * PEPISATransfer4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmActualTransferDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferDate;
			componentContext_lazy = () -> PEPISATransfer4.mmObject();
			isDerived = false;
			xmlTag = "ActlTrfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualTransferDate";
			definition = "Date when the transfer instruction was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected YesNoIndicator residualCashIndicator;
	/**
	 * Indicates whether there is cash in the account that is awaiting
	 * investment.
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
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4
	 * PEPISATransfer4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsdlCshInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidualCashIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is cash in the account that is awaiting investment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResidualCashIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PEPISATransfer4.mmObject();
			isDerived = false;
			xmlTag = "RsdlCshInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCashIndicator";
			definition = "Indicates whether there is cash in the account that is awaiting investment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ISAYearsOfIssue3 iSA;
	/**
	 * UK government schemes to encourage individuals to invest in securities
	 * based unit and investment trusts, offering certain tax benefits. These
	 * are not investment in their own right but are tax exempt wrappers in
	 * which individuals can hold equities, bonds and funds to shelter them from
	 * income and capital gains tax.
	 * 
	 * The Personal Equity Plan (PEP) and the Individual Savings Account (ISA)
	 * are provided only by UK based financial institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3
	 * ISAYearsOfIssue3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4
	 * PEPISATransfer4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \n\nThe Personal Equity Plan (PEP) and the Individual Savings Account (ISA) are provided only by UK based financial institutions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmISA = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> PEPISATransfer4.mmObject();
			isDerived = false;
			xmlTag = "ISA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISA";
			definition = "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \n\nThe Personal Equity Plan (PEP) and the Individual Savings Account (ISA) are provided only by UK based financial institutions.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ISAYearsOfIssue3.mmObject();
		}
	};
	protected PreviousYearChoice pEP;
	/**
	 * UK government schemes to encourage individuals to invest in securities
	 * based unit and investment trusts, offering certain tax benefits. These
	 * are not investment in their own right but are tax exempt wrappers in
	 * which individuals can hold equities, bonds and funds to shelter them from
	 * income and capital gains tax.
	 * 
	 * The Personal Equity Plan (PEP) and the Individual Savings Account (ISA)
	 * are provided only by UK based financial institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PreviousYearChoice
	 * PreviousYearChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4
	 * PEPISATransfer4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \n\nThe Personal Equity Plan (PEP) and the Individual Savings Account (ISA) are provided only by UK based financial institutions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPEP = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			componentContext_lazy = () -> PEPISATransfer4.mmObject();
			isDerived = false;
			xmlTag = "PEP";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PEP";
			definition = "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \n\nThe Personal Equity Plan (PEP) and the Individual Savings Account (ISA) are provided only by UK based financial institutions.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PreviousYearChoice.mmObject();
		}
	};
	protected Portfolio1 portfolio;
	/**
	 * Wrapper for a specific product or a specific sub-product owned by a set
	 * of beneficial owners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Portfolio1 Portfolio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPortfolio
	 * PortfolioTransfer.mmTransferredPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4
	 * PEPISATransfer4}</li>
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
	 * "Wrapper for a specific product or a specific sub-product owned by a set of beneficial owners."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPortfolio = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PortfolioTransfer.mmTransferredPortfolio;
			componentContext_lazy = () -> PEPISATransfer4.mmObject();
			isDerived = false;
			xmlTag = "Prtfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Portfolio";
			definition = "Wrapper for a specific product or a specific sub-product owned by a set of beneficial owners.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Portfolio1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FinancialInstrument11> financialInstrumentAssetForTransfer;
	/**
	 * Specifies the underlying assets for the PEP, ISA or portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument11
	 * FinancialInstrument11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4
	 * PEPISATransfer4}</li>
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
	 * definition} =
	 * "Specifies the underlying assets for the PEP, ISA or portfolio."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentAssetForTransfer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> PEPISATransfer4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAsstForTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAssetForTransfer";
			definition = "Specifies the underlying assets for the PEP, ISA or portfolio.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument11.mmObject();
		}
	};
	/**
	 * One and only one message element in the list (ISA, PEP, Portfolio) must
	 * be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4
	 * PEPISATransfer4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmISA
	 * PEPISATransfer4.mmISA}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmPEP
	 * PEPISATransfer4.mmPEP}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmPortfolio
	 * PEPISATransfer4.mmPortfolio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (ISA, PEP, Portfolio) must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmProductRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductRule";
			definition = "One and only one message element in the list (ISA, PEP, Portfolio) must be present.";
			messageComponent_lazy = () -> PEPISATransfer4.mmObject();
			impactedElements_lazy = () -> Arrays.asList(PEPISATransfer4.mmISA, PEPISATransfer4.mmPEP, PEPISATransfer4.mmPortfolio);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PEPISATransfer4.mmMasterReference, PEPISATransfer4.mmTransferConfirmationIdentification, PEPISATransfer4.mmTransferInstructionReference, PEPISATransfer4.mmActualTransferDate,
						PEPISATransfer4.mmResidualCashIndicator, PEPISATransfer4.mmISA, PEPISATransfer4.mmPEP, PEPISATransfer4.mmPortfolio, PEPISATransfer4.mmFinancialInstrumentAssetForTransfer);
				messageBuildingBlock_lazy = () -> Arrays.asList(PEPOrISAOrPortfolioTransferConfirmationV02.mmProductTransfer);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PEPISATransfer4";
				definition = "Describes the type of product and the assets to be transferred.";
				nextVersions_lazy = () -> Arrays.asList(ISATransfer2.mmObject());
				xors_lazy = () -> Arrays.asList(PEPISATransfer4.mmProductRule);
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

	public Max35Text getTransferConfirmationIdentification() {
		return transferConfirmationIdentification;
	}

	public void setTransferConfirmationIdentification(Max35Text transferConfirmationIdentification) {
		this.transferConfirmationIdentification = transferConfirmationIdentification;
	}

	public Max35Text getTransferInstructionReference() {
		return transferInstructionReference;
	}

	public void setTransferInstructionReference(Max35Text transferInstructionReference) {
		this.transferInstructionReference = transferInstructionReference;
	}

	public ISODate getActualTransferDate() {
		return actualTransferDate;
	}

	public void setActualTransferDate(ISODate actualTransferDate) {
		this.actualTransferDate = actualTransferDate;
	}

	public YesNoIndicator getResidualCashIndicator() {
		return residualCashIndicator;
	}

	public void setResidualCashIndicator(YesNoIndicator residualCashIndicator) {
		this.residualCashIndicator = residualCashIndicator;
	}

	public ISAYearsOfIssue3 getISA() {
		return iSA;
	}

	public void setISA(com.tools20022.repository.msg.ISAYearsOfIssue3 iSA) {
		this.iSA = iSA;
	}

	public PreviousYearChoice getPEP() {
		return pEP;
	}

	public void setPEP(PreviousYearChoice pEP) {
		this.pEP = pEP;
	}

	public Portfolio1 getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(com.tools20022.repository.msg.Portfolio1 portfolio) {
		this.portfolio = portfolio;
	}

	public List<FinancialInstrument11> getFinancialInstrumentAssetForTransfer() {
		return financialInstrumentAssetForTransfer;
	}

	public void setFinancialInstrumentAssetForTransfer(List<com.tools20022.repository.msg.FinancialInstrument11> financialInstrumentAssetForTransfer) {
		this.financialInstrumentAssetForTransfer = financialInstrumentAssetForTransfer;
	}
}