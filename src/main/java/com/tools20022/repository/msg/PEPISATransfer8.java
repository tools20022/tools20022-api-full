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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.choice.PreviousYearChoice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.PortfolioTransfer;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Describes the type of product and the assets to be transferred.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#ProductRule
 * PEPISATransfer8.ProductRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8#MasterReference
 * PEPISATransfer8.MasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8#TransferIdentification
 * PEPISATransfer8.TransferIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8#CancellationReference
 * PEPISATransfer8.CancellationReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8#ResidualCashIndicator
 * PEPISATransfer8.ResidualCashIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#ISA
 * PEPISATransfer8.ISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#PEP
 * PEPISATransfer8.PEP}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#Portfolio
 * PEPISATransfer8.Portfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8#FinancialInstrumentAssetForTransfer
 * PEPISATransfer8.FinancialInstrumentAssetForTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
 * PortfolioTransfer}</li>
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
 * "PEPISATransfer8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of product and the assets to be transferred."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer3 ISATransfer3}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class PEPISATransfer8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.Order#MasterIdentification
	 * Order.MasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8
	 * PEPISATransfer8}</li>
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
	public static final MMMessageAttribute MasterReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PEPISATransfer8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Order.MasterIdentification;
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual transfers as assigned by the instructing party. This identifier links the individual transfers together.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identification assigned by the new plan manager to each transfer of
	 * asset.
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
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8
	 * PEPISATransfer8}</li>
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
	 * "Identification assigned by the new plan manager to each transfer of asset."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TransferIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PEPISATransfer8.mmObject();
			isDerived = false;
			xmlTag = "TrfId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIdentification";
			definition = "Identification assigned by the new plan manager to each transfer of asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8
	 * PEPISATransfer8}</li>
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
	public static final MMMessageAttribute CancellationReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PEPISATransfer8.mmObject();
			isDerived = false;
			xmlTag = "CxlRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReference";
			definition = "Unique and unambiguous identifier for a transfer cancellation, as assigned by the instructing party.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8
	 * PEPISATransfer8}</li>
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
	public static final MMMessageAttribute ResidualCashIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PEPISATransfer8.mmObject();
			isDerived = false;
			xmlTag = "RsdlCshInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCashIndicator";
			definition = "Indicates whether there is cash in the account that is awaiting investment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * UK government schemes to encourage individuals to invest in securities
	 * based unit and investment trusts, offering certain tax benefits. These
	 * are not investment in their own right but are tax exempt wrappers in
	 * which individuals can hold equities, bonds and funds to shelter them from
	 * income and capital gains tax. The Personal Equity Plan (PEP) and the
	 * Individual Savings Account (ISA) are provided only by UK based financial
	 * institutions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1
	 * ISAYearsOfIssue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8
	 * PEPISATransfer8}</li>
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
	 * "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \nThe Personal Equity Plan (PEP) and the Individual Savings Account (ISA) are provided only by UK based financial institutions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ISA = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PEPISATransfer8.mmObject();
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			xmlTag = "ISA";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISA";
			definition = "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \nThe Personal Equity Plan (PEP) and the Individual Savings Account (ISA) are provided only by UK based financial institutions.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ISAYearsOfIssue1.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8
	 * PEPISATransfer8}</li>
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
	public static final MMMessageAssociationEnd PEP = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PEPISATransfer8.mmObject();
			businessComponentTrace_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			xmlTag = "PEP";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PEP";
			definition = "UK government schemes to encourage individuals to invest in securities based unit and investment trusts, offering certain tax benefits. These are not investment in their own right but are tax exempt wrappers in which individuals can hold equities, bonds and funds to shelter them from income and capital gains tax. \n\nThe Personal Equity Plan (PEP) and the Individual Savings Account (ISA) are provided only by UK based financial institutions.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PreviousYearChoice.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#TransferredPortfolio
	 * PortfolioTransfer.TransferredPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8
	 * PEPISATransfer8}</li>
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
	public static final MMMessageAssociationEnd Portfolio = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PEPISATransfer8.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.TransferredPortfolio;
			isDerived = false;
			xmlTag = "Prtfl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Portfolio";
			definition = "Wrapper for a specific product or a specific sub-product owned by a set of beneficial owners.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Portfolio1.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8
	 * PEPISATransfer8}</li>
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
	public static final MMMessageAssociationEnd FinancialInstrumentAssetForTransfer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PEPISATransfer8.mmObject();
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAsstForTrf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAssetForTransfer";
			definition = "Specifies the underlying assets for the PEP, ISA or portfolio.";
			minOccurs = 0;
			type_lazy = () -> FinancialInstrument11.mmObject();
			isComposite = true;
		}
	};
	/**
	 * One and only one message element in the list (ISA, PEP, Portfolio) must
	 * be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#ISA
	 * PEPISATransfer8.ISA}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#PEP
	 * PEPISATransfer8.PEP}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#Portfolio
	 * PEPISATransfer8.Portfolio}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8
	 * PEPISATransfer8}</li>
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
	public static final MMXor ProductRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductRule";
			definition = "One and only one message element in the list (ISA, PEP, Portfolio) must be present.";
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer8.ISA, com.tools20022.repository.msg.PEPISATransfer8.PEP, com.tools20022.repository.msg.PEPISATransfer8.Portfolio);
			messageComponent_lazy = () -> PEPISATransfer8.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer8.MasterReference, com.tools20022.repository.msg.PEPISATransfer8.TransferIdentification,
						com.tools20022.repository.msg.PEPISATransfer8.CancellationReference, com.tools20022.repository.msg.PEPISATransfer8.ResidualCashIndicator, com.tools20022.repository.msg.PEPISATransfer8.ISA,
						com.tools20022.repository.msg.PEPISATransfer8.PEP, com.tools20022.repository.msg.PEPISATransfer8.Portfolio, com.tools20022.repository.msg.PEPISATransfer8.FinancialInstrumentAssetForTransfer);
				trace_lazy = () -> PortfolioTransfer.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PEPISATransfer8";
				definition = "Describes the type of product and the assets to be transferred.";
				nextVersions_lazy = () -> Arrays.asList(ISATransfer3.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer8.ProductRule);
			}
		});
		return mmObject_lazy.get();
	}
}