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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ISATypeCode;
import com.tools20022.repository.codeset.PEPISACode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transfer by the delivering account servicer to the receiving account servicer
 * of a retail or institutional client portfolio. A portfolio can be any
 * grouping of investments, for example stocks, bonds, options, warrants. held
 * by an institution or an individual.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PortfolioTransfer" src="doc-files/PortfolioTransfer.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#TransferredYear
 * PortfolioTransfer.TransferredYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#CashComponentIndicator
 * PortfolioTransfer.CashComponentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#AccountFrom
 * PortfolioTransfer.AccountFrom}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PortfolioTransfer#AccountTo
 * PortfolioTransfer.AccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#PaymentObligation
 * PortfolioTransfer.PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#TransferredPortfolio
 * PortfolioTransfer.TransferredPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#SecuritiesDeliveryObligation
 * PortfolioTransfer.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#TransferredAmount
 * PortfolioTransfer.TransferredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#TransferredPercentage
 * PortfolioTransfer.TransferredPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#TransferDate
 * PortfolioTransfer.TransferDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#NomineeAccount
 * PortfolioTransfer.NomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#PEPOrISAPlan
 * PortfolioTransfer.PEPOrISAPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#CurrentYearISAType
 * PortfolioTransfer.CurrentYearISAType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#DebitPortfolioTransfer
 * InvestmentAccount.DebitPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#CreditPortfolioTransfer
 * InvestmentAccount.CreditPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#RelatedPortfolioTransfer
 * InvestmentAccount.RelatedPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourcePortfolioTransfer
 * PaymentObligation.PaymentSourcePortfolioTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#Transfer
 * Portfolio.Transfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedPortfolioTransfer
 * SecuritiesDeliveryObligation.RelatedPortfolioTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PreviousYearChoice#AllPreviousYears
 * PreviousYearChoice.AllPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue#PreviousYears
 * ISAYearsOfIssue.PreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#ISA
 * PEPISATransfer1.ISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#PEP
 * PEPISATransfer1.PEP}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PreviousYear1#AllPreviousYears
 * PreviousYear1.AllPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#PreviousYears
 * ISAYearsOfIssue1.PreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer6#ISA
 * PEPISATransfer6.ISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer6#PEP
 * PEPISATransfer6.PEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PreviousYear1Choice#AllPreviousYears
 * PreviousYear1Choice.AllPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4#PreviousYears
 * ISAYearsOfIssue4.PreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#ISA
 * PEPISATransfer8.ISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#PEP
 * PEPISATransfer8.PEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#ProductTransfer
 * PEPISATransfer7.ProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#ProductTransfer
 * PEPISATransfer11.ProductTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer9#ProductTransfer
 * ISATransfer9.ProductTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer2#ISA
 * PEPISATransfer2.ISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer2#PEP
 * PEPISATransfer2.PEP}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#PreviousYears
 * ISAYearsOfIssue3.PreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#ISA
 * PEPISATransfer4.ISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#PEP
 * PEPISATransfer4.PEP}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#PreviousYears
 * ISAYearsOfIssue5.PreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer3#ISA
 * PEPISATransfer3.ISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer3#PEP
 * PEPISATransfer3.PEP}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#PreviousYears
 * ISAYearsOfIssue2.PreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer5#ISA
 * PEPISATransfer5.ISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer5#PEP
 * PEPISATransfer5.PEP}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue6#PreviousYears
 * ISAYearsOfIssue6.PreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PEPOrISAChoice#ISA
 * PEPOrISAChoice.ISA}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PEPOrISAChoice#PEP
 * PEPOrISAChoice.PEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#ProductTransferAndReference
 * ISATransfer12.ProductTransferAndReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer17#ProductTransfer
 * ISATransfer17.ProductTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer20#ProductTransfer
 * ISATransfer20.ProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#ProductTransferAndReference
 * ISATransfer19.ProductTransferAndReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer25#ProductTransfer
 * ISATransfer25.ProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#ProductTransferAndReference
 * ISATransfer24.ProductTransferAndReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PreviousYearChoice
 * PreviousYearChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue
 * ISAYearsOfIssue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1
 * PEPISATransfer1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PreviousYear1 PreviousYear1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1
 * ISAYearsOfIssue1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer6
 * PEPISATransfer6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CurrentYearType1Choice
 * CurrentYearType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PreviousYear1Choice
 * PreviousYear1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PreviousYear2 PreviousYear2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4
 * ISAYearsOfIssue4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer4 ISATransfer4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer6 ISATransfer6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8
 * PEPISATransfer8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer7
 * PEPISATransfer7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer3 ISATransfer3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer11
 * PEPISATransfer11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer8 ISATransfer8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer9 ISATransfer9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer2
 * PEPISATransfer2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3
 * ISAYearsOfIssue3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4
 * PEPISATransfer4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PreviousYear3 PreviousYear3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5
 * ISAYearsOfIssue5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer2 ISATransfer2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer10 ISATransfer10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer3
 * PEPISATransfer3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer1 ISATransfer1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer7 ISATransfer7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2
 * ISAYearsOfIssue2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer5
 * PEPISATransfer5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CurrentYearType2Choice
 * CurrentYearType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISAYearsOfIssue6
 * ISAYearsOfIssue6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer5 ISATransfer5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PEPOrISAChoice
 * PEPOrISAChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1
 * PEPISACashTransfer1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2
 * PEPISACashTransfer2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer15 ISATransfer15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer16 ISATransfer16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer13 ISATransfer13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer14 ISATransfer14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer12 ISATransfer12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer17 ISATransfer17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer21 ISATransfer21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer18 ISATransfer18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer20 ISATransfer20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer19 ISATransfer19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer23 ISATransfer23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer26 ISATransfer26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer27 ISATransfer27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer22 ISATransfer22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer25 ISATransfer25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer24 ISATransfer24}</li>
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
 * "PortfolioTransfer"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Transfer by the delivering account servicer to the receiving account servicer of a retail or institutional client portfolio. A portfolio can be any grouping of  investments, for example  stocks, bonds, options, warrants. held by an institution or an individual."
 * </li>
 * </ul>
 */
public class PortfolioTransfer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the year during which the investment plan to be transferred was
	 * issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOYear
	 * ISOYear}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreviousYearChoice#SpecificPreviousYears
	 * PreviousYearChoice.SpecificPreviousYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear1#SpecificPreviousYears
	 * PreviousYear1.SpecificPreviousYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreviousYear1Choice#SpecificPreviousYears
	 * PreviousYear1Choice.SpecificPreviousYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear2#PreviousYears
	 * PreviousYear2.PreviousYears}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PreviousYear3#PreviousYear
	 * PreviousYear3.PreviousYear}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#Year
	 * PEPISACashTransfer1.Year}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#Year
	 * PEPISACashTransfer2.Year}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the year during which the investment plan to be transferred was issued."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferredYear = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PreviousYearChoice.SpecificPreviousYears, com.tools20022.repository.msg.PreviousYear1.SpecificPreviousYears,
					com.tools20022.repository.choice.PreviousYear1Choice.SpecificPreviousYears, com.tools20022.repository.msg.PreviousYear2.PreviousYears, com.tools20022.repository.msg.PreviousYear3.PreviousYear,
					com.tools20022.repository.msg.PEPISACashTransfer1.Year, com.tools20022.repository.msg.PEPISACashTransfer2.Year);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredYear";
			definition = "Specifies the year during which the investment plan to be transferred was issued.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISOYear.mmObject();
		}
	};
	/**
	 * Indicates whether an ISA investment plan contains a cash component asset
	 * for transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear1#CashComponentIndicator
	 * PreviousYear1.CashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#CashComponentIndicator
	 * ISAYearsOfIssue1.CashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear2#CashComponentIndicator
	 * PreviousYear2.CashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4#CashComponentIndicator
	 * ISAYearsOfIssue4.CashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#CashComponentIndicator
	 * ISAYearsOfIssue3.CashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear3#CashComponentIndicator
	 * PreviousYear3.CashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#CashComponentIndicator
	 * ISAYearsOfIssue5.CashComponentIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashComponentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an ISA investment plan contains a cash component asset for transfer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CashComponentIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PreviousYear1.CashComponentIndicator, com.tools20022.repository.msg.ISAYearsOfIssue1.CashComponentIndicator,
					com.tools20022.repository.msg.PreviousYear2.CashComponentIndicator, com.tools20022.repository.msg.ISAYearsOfIssue4.CashComponentIndicator, com.tools20022.repository.msg.ISAYearsOfIssue3.CashComponentIndicator,
					com.tools20022.repository.msg.PreviousYear3.CashComponentIndicator, com.tools20022.repository.msg.ISAYearsOfIssue5.CashComponentIndicator);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashComponentIndicator";
			definition = "Indicates whether an ISA investment plan contains a cash component asset for transfer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the account owned by an investor and from which the assets are
	 * transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#DebitPortfolioTransfer
	 * InvestmentAccount.DebitPortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#ClientAccount
	 * PEPISATransfer7.ClientAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#TransferorAccount
	 * PEPISATransfer11.TransferorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#TransferorAccount
	 * ISATransfer9.TransferorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12#TransferorAccount
	 * ISATransfer12.TransferorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#TransferorAccount
	 * ISATransfer19.TransferorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24#TransferorAccount
	 * ISATransfer24.TransferorAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account owned by an investor and from which the assets are transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccountFrom = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer7.ClientAccount, com.tools20022.repository.msg.PEPISATransfer11.TransferorAccount, com.tools20022.repository.msg.ISATransfer9.TransferorAccount,
					com.tools20022.repository.msg.ISATransfer12.TransferorAccount, com.tools20022.repository.msg.ISATransfer19.TransferorAccount, com.tools20022.repository.msg.ISATransfer24.TransferorAccount);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountFrom";
			definition = "Specifies the account owned by an investor and from which the assets are transferred.";
			minOccurs = 0;
			type_lazy = () -> InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.DebitPortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the account owned by an investor and to which the assets are
	 * transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#CreditPortfolioTransfer
	 * InvestmentAccount.CreditPortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account owned by an investor and to which the assets are transferred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccountTo = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountTo";
			definition = "Specifies the account owned by an investor and to which the assets are transferred.";
			minOccurs = 0;
			type_lazy = () -> InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.CreditPortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the cash amount to be transferred in relation with a portfolio
	 * transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#PaymentSourcePortfolioTransfer
	 * PaymentObligation.PaymentSourcePortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash amount to be transferred in relation with a portfolio transfer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the cash amount to be transferred in relation with a portfolio transfer.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.PaymentSourcePortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the portfolio which has to be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#Transfer
	 * Portfolio.Transfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer6#Portfolio
	 * PEPISATransfer6.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer4#Portfolio
	 * ISATransfer4.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer6#Portfolio
	 * ISATransfer6.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#Portfolio
	 * PEPISATransfer8.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer3#Portfolio
	 * ISATransfer3.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer8#Portfolio
	 * ISATransfer8.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#Portfolio
	 * PEPISATransfer4.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer2#Portfolio
	 * ISATransfer2.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer10#Portfolio
	 * ISATransfer10.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer3#Portfolio
	 * PEPISATransfer3.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer1#Portfolio
	 * ISATransfer1.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer7#Portfolio
	 * ISATransfer7.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer5#Portfolio
	 * PEPISATransfer5.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer5#Portfolio
	 * ISATransfer5.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer15#Portfolio
	 * ISATransfer15.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer16#Portfolio
	 * ISATransfer16.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer13#Portfolio
	 * ISATransfer13.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer14#Portfolio
	 * ISATransfer14.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer21#Portfolio
	 * ISATransfer21.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer18#Portfolio
	 * ISATransfer18.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer23#Portfolio
	 * ISATransfer23.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer26#Portfolio
	 * ISATransfer26.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer27#Portfolio
	 * ISATransfer27.Portfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer22#Portfolio
	 * ISATransfer22.Portfolio}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredPortfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the portfolio which has to be transferred."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransferredPortfolio = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer6.Portfolio, com.tools20022.repository.msg.ISATransfer4.Portfolio, com.tools20022.repository.msg.ISATransfer6.Portfolio,
					com.tools20022.repository.msg.PEPISATransfer8.Portfolio, com.tools20022.repository.msg.ISATransfer3.Portfolio, com.tools20022.repository.msg.ISATransfer8.Portfolio,
					com.tools20022.repository.msg.PEPISATransfer4.Portfolio, com.tools20022.repository.msg.ISATransfer2.Portfolio, com.tools20022.repository.msg.ISATransfer10.Portfolio,
					com.tools20022.repository.msg.PEPISATransfer3.Portfolio, com.tools20022.repository.msg.ISATransfer1.Portfolio, com.tools20022.repository.msg.ISATransfer7.Portfolio,
					com.tools20022.repository.msg.PEPISATransfer5.Portfolio, com.tools20022.repository.msg.ISATransfer5.Portfolio, com.tools20022.repository.msg.ISATransfer15.Portfolio,
					com.tools20022.repository.msg.ISATransfer16.Portfolio, com.tools20022.repository.msg.ISATransfer13.Portfolio, com.tools20022.repository.msg.ISATransfer14.Portfolio, com.tools20022.repository.msg.ISATransfer21.Portfolio,
					com.tools20022.repository.msg.ISATransfer18.Portfolio, com.tools20022.repository.msg.ISATransfer23.Portfolio, com.tools20022.repository.msg.ISATransfer26.Portfolio, com.tools20022.repository.msg.ISATransfer27.Portfolio,
					com.tools20022.repository.msg.ISATransfer22.Portfolio);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredPortfolio";
			definition = "Specifies the portfolio which has to be transferred.";
			minOccurs = 0;
			type_lazy = () -> Portfolio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.Transfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the financial instrument to be transferred in relation with a
	 * portfolio transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedPortfolioTransfer
	 * SecuritiesDeliveryObligation.RelatedPortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesDeliveryObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the financial instrument to be transferred in relation with a portfolio transfer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Specifies the financial instrument to be transferred in relation with a portfolio transfer.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedPortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quantity of financial instrument to transfer expressed as an amount of
	 * money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument to transfer expressed as an amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferredAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredAmount";
			definition = "Quantity of financial instrument to transfer expressed as an amount of money.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Quantity of financial instrument to transfer expressed as a percentage of
	 * the investor's total holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#PercentageToBeTransferred
	 * PEPISACashTransfer1.PercentageToBeTransferred}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#PercentageToBeTransferred
	 * PEPISACashTransfer2.PercentageToBeTransferred}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferredPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instrument to transfer expressed as a percentage of the investor's total holding."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferredPercentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISACashTransfer1.PercentageToBeTransferred, com.tools20022.repository.msg.PEPISACashTransfer2.PercentageToBeTransferred);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredPercentage";
			definition = "Quantity of financial instrument to transfer expressed as a percentage of the investor's total holding.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Execution date of the transfer instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer2#ActualTransferDate
	 * PEPISATransfer2.ActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#ActualTransferDate
	 * PEPISATransfer4.ActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2#ActualTransferDate
	 * ISATransfer2.ActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#ActualTransferDate
	 * ISATransfer10.ActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer1#RequestedTransferDate
	 * ISATransfer1.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer7#RequestedTransferDate
	 * ISATransfer7.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#SettlementDate
	 * PEPISACashTransfer2.SettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#RequestedTransferDate
	 * ISATransfer16.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#ActualTransferDate
	 * ISATransfer13.ActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21#ActualTransferDate
	 * ISATransfer21.ActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18#RequestedTransferDate
	 * ISATransfer18.RequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#ActualTransferDate
	 * ISATransfer26.ActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#RequestedTransferDate
	 * ISATransfer22.RequestedTransferDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Execution date of the transfer instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer2.ActualTransferDate, com.tools20022.repository.msg.PEPISATransfer4.ActualTransferDate,
					com.tools20022.repository.msg.ISATransfer2.ActualTransferDate, com.tools20022.repository.msg.ISATransfer10.ActualTransferDate, com.tools20022.repository.msg.ISATransfer1.RequestedTransferDate,
					com.tools20022.repository.msg.ISATransfer7.RequestedTransferDate, com.tools20022.repository.msg.PEPISACashTransfer2.SettlementDate, com.tools20022.repository.msg.ISATransfer16.RequestedTransferDate,
					com.tools20022.repository.msg.ISATransfer13.ActualTransferDate, com.tools20022.repository.msg.ISATransfer21.ActualTransferDate, com.tools20022.repository.msg.ISATransfer18.RequestedTransferDate,
					com.tools20022.repository.msg.ISATransfer26.ActualTransferDate, com.tools20022.repository.msg.ISATransfer22.RequestedTransferDate);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferDate";
			definition = "Execution date of the transfer instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Account held in the name of a party that is not the name of the
	 * beneficial owner of the shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#RelatedPortfolioTransfer
	 * InvestmentAccount.RelatedPortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#NomineeAccount
	 * PEPISATransfer7.NomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#NomineeAccount
	 * PEPISATransfer11.NomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#NomineeAccount
	 * ISATransfer9.NomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12#NomineeAccount
	 * ISATransfer12.NomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#NomineeAccount
	 * ISATransfer19.NomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24#NomineeAccount
	 * ISATransfer24.NomineeAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NomineeAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account held in the name of a party that is not the name of the beneficial owner of the shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NomineeAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer7.NomineeAccount, com.tools20022.repository.msg.PEPISATransfer11.NomineeAccount, com.tools20022.repository.msg.ISATransfer9.NomineeAccount,
					com.tools20022.repository.msg.ISATransfer12.NomineeAccount, com.tools20022.repository.msg.ISATransfer19.NomineeAccount, com.tools20022.repository.msg.ISATransfer24.NomineeAccount);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.RelatedPortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the investment plan is a PEP or ISA type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PEPISACode
	 * PEPISACode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#Type
	 * PEPISACashTransfer1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#Type
	 * PEPISACashTransfer2.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PEPOrISAPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investment plan is a PEP or ISA type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PEPOrISAPlan = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISACashTransfer1.Type, com.tools20022.repository.msg.PEPISACashTransfer2.Type);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PEPOrISAPlan";
			definition = "Specifies whether the investment plan is a PEP or ISA type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PEPISACode.mmObject();
		}
	};
	/**
	 * Current year ISA is an ISA that was issued during the current fiscal
	 * year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ISATypeCode
	 * ISATypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue#CurrentYear
	 * ISAYearsOfIssue.CurrentYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#CurrentYearType
	 * ISAYearsOfIssue1.CurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#ExtendedCurrentYearType
	 * ISAYearsOfIssue1.ExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType1Choice#CurrentYearType
	 * CurrentYearType1Choice.CurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType1Choice#ExtendedCurrentYearType
	 * CurrentYearType1Choice.ExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4#CurrentYear
	 * ISAYearsOfIssue4.CurrentYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#CurrentYearType
	 * ISAYearsOfIssue3.CurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#ExtendedCurrentYearType
	 * ISAYearsOfIssue3.ExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#CurrentYear
	 * ISAYearsOfIssue5.CurrentYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#CurrentYearType
	 * ISAYearsOfIssue2.CurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#ExtendedCurrentYearType
	 * ISAYearsOfIssue2.ExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType2Choice#CurrentYearType
	 * CurrentYearType2Choice.CurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType2Choice#ExtendedCurrentYearType
	 * CurrentYearType2Choice.ExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue6#CurrentYear
	 * ISAYearsOfIssue6.CurrentYear}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentYearISAType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current year ISA is an ISA that was issued during the current fiscal year."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CurrentYearISAType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue.CurrentYear, com.tools20022.repository.msg.ISAYearsOfIssue1.CurrentYearType,
					com.tools20022.repository.msg.ISAYearsOfIssue1.ExtendedCurrentYearType, com.tools20022.repository.choice.CurrentYearType1Choice.CurrentYearType,
					com.tools20022.repository.choice.CurrentYearType1Choice.ExtendedCurrentYearType, com.tools20022.repository.msg.ISAYearsOfIssue4.CurrentYear, com.tools20022.repository.msg.ISAYearsOfIssue3.CurrentYearType,
					com.tools20022.repository.msg.ISAYearsOfIssue3.ExtendedCurrentYearType, com.tools20022.repository.msg.ISAYearsOfIssue5.CurrentYear, com.tools20022.repository.msg.ISAYearsOfIssue2.CurrentYearType,
					com.tools20022.repository.msg.ISAYearsOfIssue2.ExtendedCurrentYearType, com.tools20022.repository.choice.CurrentYearType2Choice.CurrentYearType,
					com.tools20022.repository.choice.CurrentYearType2Choice.ExtendedCurrentYearType, com.tools20022.repository.msg.ISAYearsOfIssue6.CurrentYear);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrentYearISAType";
			definition = "Current year ISA is an ISA that was issued during the current fiscal year.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISATypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PortfolioTransfer";
				definition = "Transfer by the delivering account servicer to the receiving account servicer of a retail or institutional client portfolio. A portfolio can be any grouping of  investments, for example  stocks, bonds, options, warrants. held by an institution or an individual.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.DebitPortfolioTransfer, com.tools20022.repository.entity.InvestmentAccount.CreditPortfolioTransfer,
						com.tools20022.repository.entity.InvestmentAccount.RelatedPortfolioTransfer, com.tools20022.repository.entity.PaymentObligation.PaymentSourcePortfolioTransfer, com.tools20022.repository.entity.Portfolio.Transfer,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedPortfolioTransfer);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PreviousYearChoice.AllPreviousYears, com.tools20022.repository.msg.ISAYearsOfIssue.PreviousYears,
						com.tools20022.repository.msg.PEPISATransfer1.ISA, com.tools20022.repository.msg.PEPISATransfer1.PEP, com.tools20022.repository.msg.PreviousYear1.AllPreviousYears,
						com.tools20022.repository.msg.ISAYearsOfIssue1.PreviousYears, com.tools20022.repository.msg.PEPISATransfer6.ISA, com.tools20022.repository.msg.PEPISATransfer6.PEP,
						com.tools20022.repository.choice.PreviousYear1Choice.AllPreviousYears, com.tools20022.repository.msg.ISAYearsOfIssue4.PreviousYears, com.tools20022.repository.msg.PEPISATransfer8.ISA,
						com.tools20022.repository.msg.PEPISATransfer8.PEP, com.tools20022.repository.msg.PEPISATransfer7.ProductTransfer, com.tools20022.repository.msg.PEPISATransfer11.ProductTransfer,
						com.tools20022.repository.msg.ISATransfer9.ProductTransfer, com.tools20022.repository.msg.PEPISATransfer2.ISA, com.tools20022.repository.msg.PEPISATransfer2.PEP,
						com.tools20022.repository.msg.ISAYearsOfIssue3.PreviousYears, com.tools20022.repository.msg.PEPISATransfer4.ISA, com.tools20022.repository.msg.PEPISATransfer4.PEP,
						com.tools20022.repository.msg.ISAYearsOfIssue5.PreviousYears, com.tools20022.repository.msg.PEPISATransfer3.ISA, com.tools20022.repository.msg.PEPISATransfer3.PEP,
						com.tools20022.repository.msg.ISAYearsOfIssue2.PreviousYears, com.tools20022.repository.msg.PEPISATransfer5.ISA, com.tools20022.repository.msg.PEPISATransfer5.PEP,
						com.tools20022.repository.msg.ISAYearsOfIssue6.PreviousYears, com.tools20022.repository.choice.PEPOrISAChoice.ISA, com.tools20022.repository.choice.PEPOrISAChoice.PEP,
						com.tools20022.repository.msg.ISATransfer12.ProductTransferAndReference, com.tools20022.repository.msg.ISATransfer17.ProductTransfer, com.tools20022.repository.msg.ISATransfer20.ProductTransfer,
						com.tools20022.repository.msg.ISATransfer19.ProductTransferAndReference, com.tools20022.repository.msg.ISATransfer25.ProductTransfer, com.tools20022.repository.msg.ISATransfer24.ProductTransferAndReference);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioTransfer.TransferredYear, com.tools20022.repository.entity.PortfolioTransfer.CashComponentIndicator,
						com.tools20022.repository.entity.PortfolioTransfer.AccountFrom, com.tools20022.repository.entity.PortfolioTransfer.AccountTo, com.tools20022.repository.entity.PortfolioTransfer.PaymentObligation,
						com.tools20022.repository.entity.PortfolioTransfer.TransferredPortfolio, com.tools20022.repository.entity.PortfolioTransfer.SecuritiesDeliveryObligation,
						com.tools20022.repository.entity.PortfolioTransfer.TransferredAmount, com.tools20022.repository.entity.PortfolioTransfer.TransferredPercentage, com.tools20022.repository.entity.PortfolioTransfer.TransferDate,
						com.tools20022.repository.entity.PortfolioTransfer.NomineeAccount, com.tools20022.repository.entity.PortfolioTransfer.PEPOrISAPlan, com.tools20022.repository.entity.PortfolioTransfer.CurrentYearISAType);
				derivationComponent_lazy = () -> Arrays.asList(PreviousYearChoice.mmObject(), ISAYearsOfIssue.mmObject(), PEPISATransfer1.mmObject(), PreviousYear1.mmObject(), ISAYearsOfIssue1.mmObject(), PEPISATransfer6.mmObject(),
						CurrentYearType1Choice.mmObject(), PreviousYear1Choice.mmObject(), PreviousYear2.mmObject(), ISAYearsOfIssue4.mmObject(), ISATransfer4.mmObject(), ISATransfer6.mmObject(), PEPISATransfer8.mmObject(),
						PEPISATransfer7.mmObject(), ISATransfer3.mmObject(), PEPISATransfer11.mmObject(), ISATransfer8.mmObject(), ISATransfer9.mmObject(), PEPISATransfer2.mmObject(), ISAYearsOfIssue3.mmObject(),
						PEPISATransfer4.mmObject(), PreviousYear3.mmObject(), ISAYearsOfIssue5.mmObject(), ISATransfer2.mmObject(), ISATransfer10.mmObject(), PEPISATransfer3.mmObject(), ISATransfer1.mmObject(), ISATransfer7.mmObject(),
						ISAYearsOfIssue2.mmObject(), PEPISATransfer5.mmObject(), CurrentYearType2Choice.mmObject(), ISAYearsOfIssue6.mmObject(), ISATransfer5.mmObject(), PEPOrISAChoice.mmObject(), PEPISACashTransfer1.mmObject(),
						PEPISACashTransfer2.mmObject(), ISATransfer15.mmObject(), ISATransfer16.mmObject(), ISATransfer13.mmObject(), ISATransfer14.mmObject(), ISATransfer12.mmObject(), ISATransfer17.mmObject(), ISATransfer21.mmObject(),
						ISATransfer18.mmObject(), ISATransfer20.mmObject(), ISATransfer19.mmObject(), ISATransfer23.mmObject(), ISATransfer26.mmObject(), ISATransfer27.mmObject(), ISATransfer22.mmObject(), ISATransfer25.mmObject(),
						ISATransfer24.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}