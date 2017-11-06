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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredYear
 * PortfolioTransfer.mmTransferredYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCashComponentIndicator
 * PortfolioTransfer.mmCashComponentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountFrom
 * PortfolioTransfer.mmAccountFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmAccountTo
 * PortfolioTransfer.mmAccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPaymentObligation
 * PortfolioTransfer.mmPaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPortfolio
 * PortfolioTransfer.mmTransferredPortfolio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmSecuritiesDeliveryObligation
 * PortfolioTransfer.mmSecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredAmount
 * PortfolioTransfer.mmTransferredAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferredPercentage
 * PortfolioTransfer.mmTransferredPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmTransferDate
 * PortfolioTransfer.mmTransferDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmNomineeAccount
 * PortfolioTransfer.mmNomineeAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmPEPOrISAPlan
 * PortfolioTransfer.mmPEPOrISAPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#mmCurrentYearISAType
 * PortfolioTransfer.mmCurrentYearISAType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDebitPortfolioTransfer
 * InvestmentAccount.mmDebitPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCreditPortfolioTransfer
 * InvestmentAccount.mmCreditPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmRelatedPortfolioTransfer
 * InvestmentAccount.mmRelatedPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourcePortfolioTransfer
 * PaymentObligation.mmPaymentSourcePortfolioTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#mmTransfer
 * Portfolio.mmTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedPortfolioTransfer
 * SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PreviousYearChoice#mmAllPreviousYears
 * PreviousYearChoice.mmAllPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue#mmPreviousYears
 * ISAYearsOfIssue.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#mmISA
 * PEPISATransfer1.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer1#mmPEP
 * PEPISATransfer1.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PreviousYear1#mmAllPreviousYears
 * PreviousYear1.mmAllPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmPreviousYears
 * ISAYearsOfIssue1.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer6#mmISA
 * PEPISATransfer6.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer6#mmPEP
 * PEPISATransfer6.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PreviousYear1Choice#mmAllPreviousYears
 * PreviousYear1Choice.mmAllPreviousYears}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4#mmPreviousYears
 * ISAYearsOfIssue4.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#mmISA
 * PEPISATransfer8.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer8#mmPEP
 * PEPISATransfer8.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmProductTransfer
 * PEPISATransfer7.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmProductTransfer
 * PEPISATransfer11.mmProductTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer9#mmProductTransfer
 * ISATransfer9.mmProductTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer2#mmISA
 * PEPISATransfer2.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer2#mmPEP
 * PEPISATransfer2.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmPreviousYears
 * ISAYearsOfIssue3.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmISA
 * PEPISATransfer4.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmPEP
 * PEPISATransfer4.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#mmPreviousYears
 * ISAYearsOfIssue5.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer3#mmISA
 * PEPISATransfer3.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer3#mmPEP
 * PEPISATransfer3.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#mmPreviousYears
 * ISAYearsOfIssue2.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer5#mmISA
 * PEPISATransfer5.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PEPISATransfer5#mmPEP
 * PEPISATransfer5.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue6#mmPreviousYears
 * ISAYearsOfIssue6.mmPreviousYears}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PEPOrISAChoice#mmISA
 * PEPOrISAChoice.mmISA}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PEPOrISAChoice#mmPEP
 * PEPOrISAChoice.mmPEP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmProductTransferAndReference
 * ISATransfer12.mmProductTransferAndReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer17#mmProductTransfer
 * ISATransfer17.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer20#mmProductTransfer
 * ISATransfer20.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmProductTransferAndReference
 * ISATransfer19.mmProductTransferAndReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer25#mmProductTransfer
 * ISATransfer25.mmProductTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmProductTransferAndReference
 * ISATransfer24.mmProductTransferAndReference}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected ISOYear transferredYear;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreviousYearChoice#mmSpecificPreviousYears
	 * PreviousYearChoice.mmSpecificPreviousYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear1#mmSpecificPreviousYears
	 * PreviousYear1.mmSpecificPreviousYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PreviousYear1Choice#mmSpecificPreviousYears
	 * PreviousYear1Choice.mmSpecificPreviousYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear2#mmPreviousYears
	 * PreviousYear2.mmPreviousYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear3#mmPreviousYear
	 * PreviousYear3.mmPreviousYear}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmYear
	 * PEPISACashTransfer1.mmYear}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmYear
	 * PEPISACashTransfer2.mmYear}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTransferredYear = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PreviousYearChoice.mmSpecificPreviousYears, com.tools20022.repository.msg.PreviousYear1.mmSpecificPreviousYears,
					com.tools20022.repository.choice.PreviousYear1Choice.mmSpecificPreviousYears, com.tools20022.repository.msg.PreviousYear2.mmPreviousYears, com.tools20022.repository.msg.PreviousYear3.mmPreviousYear,
					com.tools20022.repository.msg.PEPISACashTransfer1.mmYear, com.tools20022.repository.msg.PEPISACashTransfer2.mmYear);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredYear";
			definition = "Specifies the year during which the investment plan to be transferred was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISOYear.mmObject();
		}
	};
	protected YesNoIndicator cashComponentIndicator;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear1#mmCashComponentIndicator
	 * PreviousYear1.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmCashComponentIndicator
	 * ISAYearsOfIssue1.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear2#mmCashComponentIndicator
	 * PreviousYear2.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4#mmCashComponentIndicator
	 * ISAYearsOfIssue4.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmCashComponentIndicator
	 * ISAYearsOfIssue3.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PreviousYear3#mmCashComponentIndicator
	 * PreviousYear3.mmCashComponentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#mmCashComponentIndicator
	 * ISAYearsOfIssue5.mmCashComponentIndicator}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCashComponentIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PreviousYear1.mmCashComponentIndicator, com.tools20022.repository.msg.ISAYearsOfIssue1.mmCashComponentIndicator,
					com.tools20022.repository.msg.PreviousYear2.mmCashComponentIndicator, com.tools20022.repository.msg.ISAYearsOfIssue4.mmCashComponentIndicator, com.tools20022.repository.msg.ISAYearsOfIssue3.mmCashComponentIndicator,
					com.tools20022.repository.msg.PreviousYear3.mmCashComponentIndicator, com.tools20022.repository.msg.ISAYearsOfIssue5.mmCashComponentIndicator);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashComponentIndicator";
			definition = "Indicates whether an ISA investment plan contains a cash component asset for transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> accountFrom;
	/**
	 * Specifies the account owned by an investor and from which the assets are
	 * transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDebitPortfolioTransfer
	 * InvestmentAccount.mmDebitPortfolioTransfer}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmClientAccount
	 * PEPISATransfer7.mmClientAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmTransferorAccount
	 * PEPISATransfer11.mmTransferorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmTransferorAccount
	 * ISATransfer9.mmTransferorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmTransferorAccount
	 * ISATransfer12.mmTransferorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmTransferorAccount
	 * ISATransfer19.mmTransferorAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmTransferorAccount
	 * ISATransfer24.mmTransferorAccount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmAccountFrom = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer7.mmClientAccount, com.tools20022.repository.msg.PEPISATransfer11.mmTransferorAccount,
					com.tools20022.repository.msg.ISATransfer9.mmTransferorAccount, com.tools20022.repository.msg.ISATransfer12.mmTransferorAccount, com.tools20022.repository.msg.ISATransfer19.mmTransferorAccount,
					com.tools20022.repository.msg.ISATransfer24.mmTransferorAccount);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountFrom";
			definition = "Specifies the account owned by an investor and from which the assets are transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmDebitPortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentAccount> accountTo;
	/**
	 * Specifies the account owned by an investor and to which the assets are
	 * transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCreditPortfolioTransfer
	 * InvestmentAccount.mmCreditPortfolioTransfer}</li>
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
	public static final MMBusinessAssociationEnd mmAccountTo = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountTo";
			definition = "Specifies the account owned by an investor and to which the assets are transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmCreditPortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> paymentObligation;
	/**
	 * Specifies the cash amount to be transferred in relation with a portfolio
	 * transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentSourcePortfolioTransfer
	 * PaymentObligation.mmPaymentSourcePortfolioTransfer}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentObligation";
			definition = "Specifies the cash amount to be transferred in relation with a portfolio transfer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPaymentSourcePortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Portfolio> transferredPortfolio;
	/**
	 * Specifies the portfolio which has to be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#mmTransfer
	 * Portfolio.mmTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer6#mmPortfolio
	 * PEPISATransfer6.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer4#mmPortfolio
	 * ISATransfer4.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer6#mmPortfolio
	 * ISATransfer6.mmPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer8#mmPortfolio
	 * PEPISATransfer8.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer3#mmPortfolio
	 * ISATransfer3.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer8#mmPortfolio
	 * ISATransfer8.mmPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmPortfolio
	 * PEPISATransfer4.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer2#mmPortfolio
	 * ISATransfer2.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer10#mmPortfolio
	 * ISATransfer10.mmPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer3#mmPortfolio
	 * PEPISATransfer3.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer1#mmPortfolio
	 * ISATransfer1.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer7#mmPortfolio
	 * ISATransfer7.mmPortfolio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer5#mmPortfolio
	 * PEPISATransfer5.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer5#mmPortfolio
	 * ISATransfer5.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer15#mmPortfolio
	 * ISATransfer15.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer16#mmPortfolio
	 * ISATransfer16.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer13#mmPortfolio
	 * ISATransfer13.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer14#mmPortfolio
	 * ISATransfer14.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer21#mmPortfolio
	 * ISATransfer21.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer18#mmPortfolio
	 * ISATransfer18.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer23#mmPortfolio
	 * ISATransfer23.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer26#mmPortfolio
	 * ISATransfer26.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer27#mmPortfolio
	 * ISATransfer27.mmPortfolio}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ISATransfer22#mmPortfolio
	 * ISATransfer22.mmPortfolio}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmTransferredPortfolio = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer6.mmPortfolio, com.tools20022.repository.msg.ISATransfer4.mmPortfolio, com.tools20022.repository.msg.ISATransfer6.mmPortfolio,
					com.tools20022.repository.msg.PEPISATransfer8.mmPortfolio, com.tools20022.repository.msg.ISATransfer3.mmPortfolio, com.tools20022.repository.msg.ISATransfer8.mmPortfolio,
					com.tools20022.repository.msg.PEPISATransfer4.mmPortfolio, com.tools20022.repository.msg.ISATransfer2.mmPortfolio, com.tools20022.repository.msg.ISATransfer10.mmPortfolio,
					com.tools20022.repository.msg.PEPISATransfer3.mmPortfolio, com.tools20022.repository.msg.ISATransfer1.mmPortfolio, com.tools20022.repository.msg.ISATransfer7.mmPortfolio,
					com.tools20022.repository.msg.PEPISATransfer5.mmPortfolio, com.tools20022.repository.msg.ISATransfer5.mmPortfolio, com.tools20022.repository.msg.ISATransfer15.mmPortfolio,
					com.tools20022.repository.msg.ISATransfer16.mmPortfolio, com.tools20022.repository.msg.ISATransfer13.mmPortfolio, com.tools20022.repository.msg.ISATransfer14.mmPortfolio,
					com.tools20022.repository.msg.ISATransfer21.mmPortfolio, com.tools20022.repository.msg.ISATransfer18.mmPortfolio, com.tools20022.repository.msg.ISATransfer23.mmPortfolio,
					com.tools20022.repository.msg.ISATransfer26.mmPortfolio, com.tools20022.repository.msg.ISATransfer27.mmPortfolio, com.tools20022.repository.msg.ISATransfer22.mmPortfolio);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredPortfolio";
			definition = "Specifies the portfolio which has to be transferred.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.mmTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation;
	/**
	 * Specifies the financial instrument to be transferred in relation with a
	 * portfolio transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmRelatedPortfolioTransfer
	 * SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesDeliveryObligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesDeliveryObligation";
			definition = "Specifies the financial instrument to be transferred in relation with a portfolio transfer.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmObject();
		}
	};
	protected CurrencyAndAmount transferredAmount;
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
	public static final MMBusinessAttribute mmTransferredAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredAmount";
			definition = "Quantity of financial instrument to transfer expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate transferredPercentage;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmPercentageToBeTransferred
	 * PEPISACashTransfer1.mmPercentageToBeTransferred}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmPercentageToBeTransferred
	 * PEPISACashTransfer2.mmPercentageToBeTransferred}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTransferredPercentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISACashTransfer1.mmPercentageToBeTransferred, com.tools20022.repository.msg.PEPISACashTransfer2.mmPercentageToBeTransferred);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferredPercentage";
			definition = "Quantity of financial instrument to transfer expressed as a percentage of the investor's total holding.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ISODateTime transferDate;
	/**
	 * Execution date of the transfer instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer2#mmActualTransferDate
	 * PEPISATransfer2.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer4#mmActualTransferDate
	 * PEPISATransfer4.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer2#mmActualTransferDate
	 * ISATransfer2.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer10#mmActualTransferDate
	 * ISATransfer10.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer1#mmRequestedTransferDate
	 * ISATransfer1.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer7#mmRequestedTransferDate
	 * ISATransfer7.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmSettlementDate
	 * PEPISACashTransfer2.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer16#mmRequestedTransferDate
	 * ISATransfer16.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer13#mmActualTransferDate
	 * ISATransfer13.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer21#mmActualTransferDate
	 * ISATransfer21.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer18#mmRequestedTransferDate
	 * ISATransfer18.mmRequestedTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer26#mmActualTransferDate
	 * ISATransfer26.mmActualTransferDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer22#mmRequestedTransferDate
	 * ISATransfer22.mmRequestedTransferDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTransferDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer2.mmActualTransferDate, com.tools20022.repository.msg.PEPISATransfer4.mmActualTransferDate,
					com.tools20022.repository.msg.ISATransfer2.mmActualTransferDate, com.tools20022.repository.msg.ISATransfer10.mmActualTransferDate, com.tools20022.repository.msg.ISATransfer1.mmRequestedTransferDate,
					com.tools20022.repository.msg.ISATransfer7.mmRequestedTransferDate, com.tools20022.repository.msg.PEPISACashTransfer2.mmSettlementDate, com.tools20022.repository.msg.ISATransfer16.mmRequestedTransferDate,
					com.tools20022.repository.msg.ISATransfer13.mmActualTransferDate, com.tools20022.repository.msg.ISATransfer21.mmActualTransferDate, com.tools20022.repository.msg.ISATransfer18.mmRequestedTransferDate,
					com.tools20022.repository.msg.ISATransfer26.mmActualTransferDate, com.tools20022.repository.msg.ISATransfer22.mmRequestedTransferDate);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferDate";
			definition = "Execution date of the transfer instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected InvestmentAccount nomineeAccount;
	/**
	 * Account held in the name of a party that is not the name of the
	 * beneficial owner of the shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmRelatedPortfolioTransfer
	 * InvestmentAccount.mmRelatedPortfolioTransfer}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer7#mmNomineeAccount
	 * PEPISATransfer7.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PEPISATransfer11#mmNomineeAccount
	 * PEPISATransfer11.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer9#mmNomineeAccount
	 * ISATransfer9.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer12#mmNomineeAccount
	 * ISATransfer12.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer19#mmNomineeAccount
	 * ISATransfer19.mmNomineeAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISATransfer24#mmNomineeAccount
	 * ISATransfer24.mmNomineeAccount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmNomineeAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISATransfer7.mmNomineeAccount, com.tools20022.repository.msg.PEPISATransfer11.mmNomineeAccount, com.tools20022.repository.msg.ISATransfer9.mmNomineeAccount,
					com.tools20022.repository.msg.ISATransfer12.mmNomineeAccount, com.tools20022.repository.msg.ISATransfer19.mmNomineeAccount, com.tools20022.repository.msg.ISATransfer24.mmNomineeAccount);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NomineeAccount";
			definition = "Account held in the name of a party that is not the name of the beneficial owner of the shares.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmRelatedPortfolioTransfer;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccount.mmObject();
		}
	};
	protected PEPISACode pEPOrISAPlan;
	/**
	 * Specifies whether the investment plan is a PEP or ISA type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.PEPISACode
	 * PEPISACode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer1#mmType
	 * PEPISACashTransfer1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PEPISACashTransfer2#mmType
	 * PEPISACashTransfer2.mmType}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPEPOrISAPlan = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PEPISACashTransfer1.mmType, com.tools20022.repository.msg.PEPISACashTransfer2.mmType);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PEPOrISAPlan";
			definition = "Specifies whether the investment plan is a PEP or ISA type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PEPISACode.mmObject();
		}
	};
	protected ISATypeCode currentYearISAType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue#mmCurrentYear
	 * ISAYearsOfIssue.mmCurrentYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmCurrentYearType
	 * ISAYearsOfIssue1.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue1#mmExtendedCurrentYearType
	 * ISAYearsOfIssue1.mmExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType1Choice#mmCurrentYearType
	 * CurrentYearType1Choice.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType1Choice#mmExtendedCurrentYearType
	 * CurrentYearType1Choice.mmExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue4#mmCurrentYear
	 * ISAYearsOfIssue4.mmCurrentYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmCurrentYearType
	 * ISAYearsOfIssue3.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue3#mmExtendedCurrentYearType
	 * ISAYearsOfIssue3.mmExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue5#mmCurrentYear
	 * ISAYearsOfIssue5.mmCurrentYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#mmCurrentYearType
	 * ISAYearsOfIssue2.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue2#mmExtendedCurrentYearType
	 * ISAYearsOfIssue2.mmExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType2Choice#mmCurrentYearType
	 * CurrentYearType2Choice.mmCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CurrentYearType2Choice#mmExtendedCurrentYearType
	 * CurrentYearType2Choice.mmExtendedCurrentYearType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ISAYearsOfIssue6#mmCurrentYear
	 * ISAYearsOfIssue6.mmCurrentYear}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCurrentYearISAType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ISAYearsOfIssue.mmCurrentYear, com.tools20022.repository.msg.ISAYearsOfIssue1.mmCurrentYearType,
					com.tools20022.repository.msg.ISAYearsOfIssue1.mmExtendedCurrentYearType, com.tools20022.repository.choice.CurrentYearType1Choice.mmCurrentYearType,
					com.tools20022.repository.choice.CurrentYearType1Choice.mmExtendedCurrentYearType, com.tools20022.repository.msg.ISAYearsOfIssue4.mmCurrentYear, com.tools20022.repository.msg.ISAYearsOfIssue3.mmCurrentYearType,
					com.tools20022.repository.msg.ISAYearsOfIssue3.mmExtendedCurrentYearType, com.tools20022.repository.msg.ISAYearsOfIssue5.mmCurrentYear, com.tools20022.repository.msg.ISAYearsOfIssue2.mmCurrentYearType,
					com.tools20022.repository.msg.ISAYearsOfIssue2.mmExtendedCurrentYearType, com.tools20022.repository.choice.CurrentYearType2Choice.mmCurrentYearType,
					com.tools20022.repository.choice.CurrentYearType2Choice.mmExtendedCurrentYearType, com.tools20022.repository.msg.ISAYearsOfIssue6.mmCurrentYear);
			elementContext_lazy = () -> PortfolioTransfer.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrentYearISAType";
			definition = "Current year ISA is an ISA that was issued during the current fiscal year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISATypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PortfolioTransfer";
				definition = "Transfer by the delivering account servicer to the receiving account servicer of a retail or institutional client portfolio. A portfolio can be any grouping of  investments, for example  stocks, bonds, options, warrants. held by an institution or an individual.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccount.mmDebitPortfolioTransfer, com.tools20022.repository.entity.InvestmentAccount.mmCreditPortfolioTransfer,
						com.tools20022.repository.entity.InvestmentAccount.mmRelatedPortfolioTransfer, com.tools20022.repository.entity.PaymentObligation.mmPaymentSourcePortfolioTransfer,
						com.tools20022.repository.entity.Portfolio.mmTransfer, com.tools20022.repository.entity.SecuritiesDeliveryObligation.mmRelatedPortfolioTransfer);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PreviousYearChoice.mmAllPreviousYears, com.tools20022.repository.msg.ISAYearsOfIssue.mmPreviousYears,
						com.tools20022.repository.msg.PEPISATransfer1.mmISA, com.tools20022.repository.msg.PEPISATransfer1.mmPEP, com.tools20022.repository.msg.PreviousYear1.mmAllPreviousYears,
						com.tools20022.repository.msg.ISAYearsOfIssue1.mmPreviousYears, com.tools20022.repository.msg.PEPISATransfer6.mmISA, com.tools20022.repository.msg.PEPISATransfer6.mmPEP,
						com.tools20022.repository.choice.PreviousYear1Choice.mmAllPreviousYears, com.tools20022.repository.msg.ISAYearsOfIssue4.mmPreviousYears, com.tools20022.repository.msg.PEPISATransfer8.mmISA,
						com.tools20022.repository.msg.PEPISATransfer8.mmPEP, com.tools20022.repository.msg.PEPISATransfer7.mmProductTransfer, com.tools20022.repository.msg.PEPISATransfer11.mmProductTransfer,
						com.tools20022.repository.msg.ISATransfer9.mmProductTransfer, com.tools20022.repository.msg.PEPISATransfer2.mmISA, com.tools20022.repository.msg.PEPISATransfer2.mmPEP,
						com.tools20022.repository.msg.ISAYearsOfIssue3.mmPreviousYears, com.tools20022.repository.msg.PEPISATransfer4.mmISA, com.tools20022.repository.msg.PEPISATransfer4.mmPEP,
						com.tools20022.repository.msg.ISAYearsOfIssue5.mmPreviousYears, com.tools20022.repository.msg.PEPISATransfer3.mmISA, com.tools20022.repository.msg.PEPISATransfer3.mmPEP,
						com.tools20022.repository.msg.ISAYearsOfIssue2.mmPreviousYears, com.tools20022.repository.msg.PEPISATransfer5.mmISA, com.tools20022.repository.msg.PEPISATransfer5.mmPEP,
						com.tools20022.repository.msg.ISAYearsOfIssue6.mmPreviousYears, com.tools20022.repository.choice.PEPOrISAChoice.mmISA, com.tools20022.repository.choice.PEPOrISAChoice.mmPEP,
						com.tools20022.repository.msg.ISATransfer12.mmProductTransferAndReference, com.tools20022.repository.msg.ISATransfer17.mmProductTransfer, com.tools20022.repository.msg.ISATransfer20.mmProductTransfer,
						com.tools20022.repository.msg.ISATransfer19.mmProductTransferAndReference, com.tools20022.repository.msg.ISATransfer25.mmProductTransfer, com.tools20022.repository.msg.ISATransfer24.mmProductTransferAndReference);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PortfolioTransfer.mmTransferredYear, com.tools20022.repository.entity.PortfolioTransfer.mmCashComponentIndicator,
						com.tools20022.repository.entity.PortfolioTransfer.mmAccountFrom, com.tools20022.repository.entity.PortfolioTransfer.mmAccountTo, com.tools20022.repository.entity.PortfolioTransfer.mmPaymentObligation,
						com.tools20022.repository.entity.PortfolioTransfer.mmTransferredPortfolio, com.tools20022.repository.entity.PortfolioTransfer.mmSecuritiesDeliveryObligation,
						com.tools20022.repository.entity.PortfolioTransfer.mmTransferredAmount, com.tools20022.repository.entity.PortfolioTransfer.mmTransferredPercentage, com.tools20022.repository.entity.PortfolioTransfer.mmTransferDate,
						com.tools20022.repository.entity.PortfolioTransfer.mmNomineeAccount, com.tools20022.repository.entity.PortfolioTransfer.mmPEPOrISAPlan, com.tools20022.repository.entity.PortfolioTransfer.mmCurrentYearISAType);
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

	public ISOYear getTransferredYear() {
		return transferredYear;
	}

	public void setTransferredYear(ISOYear transferredYear) {
		this.transferredYear = transferredYear;
	}

	public YesNoIndicator getCashComponentIndicator() {
		return cashComponentIndicator;
	}

	public void setCashComponentIndicator(YesNoIndicator cashComponentIndicator) {
		this.cashComponentIndicator = cashComponentIndicator;
	}

	public List<InvestmentAccount> getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(List<com.tools20022.repository.entity.InvestmentAccount> accountFrom) {
		this.accountFrom = accountFrom;
	}

	public List<InvestmentAccount> getAccountTo() {
		return accountTo;
	}

	public void setAccountTo(List<com.tools20022.repository.entity.InvestmentAccount> accountTo) {
		this.accountTo = accountTo;
	}

	public List<PaymentObligation> getPaymentObligation() {
		return paymentObligation;
	}

	public void setPaymentObligation(List<com.tools20022.repository.entity.PaymentObligation> paymentObligation) {
		this.paymentObligation = paymentObligation;
	}

	public List<Portfolio> getTransferredPortfolio() {
		return transferredPortfolio;
	}

	public void setTransferredPortfolio(List<com.tools20022.repository.entity.Portfolio> transferredPortfolio) {
		this.transferredPortfolio = transferredPortfolio;
	}

	public List<SecuritiesDeliveryObligation> getSecuritiesDeliveryObligation() {
		return securitiesDeliveryObligation;
	}

	public void setSecuritiesDeliveryObligation(List<com.tools20022.repository.entity.SecuritiesDeliveryObligation> securitiesDeliveryObligation) {
		this.securitiesDeliveryObligation = securitiesDeliveryObligation;
	}

	public CurrencyAndAmount getTransferredAmount() {
		return transferredAmount;
	}

	public void setTransferredAmount(CurrencyAndAmount transferredAmount) {
		this.transferredAmount = transferredAmount;
	}

	public PercentageRate getTransferredPercentage() {
		return transferredPercentage;
	}

	public void setTransferredPercentage(PercentageRate transferredPercentage) {
		this.transferredPercentage = transferredPercentage;
	}

	public ISODateTime getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(ISODateTime transferDate) {
		this.transferDate = transferDate;
	}

	public InvestmentAccount getNomineeAccount() {
		return nomineeAccount;
	}

	public void setNomineeAccount(com.tools20022.repository.entity.InvestmentAccount nomineeAccount) {
		this.nomineeAccount = nomineeAccount;
	}

	public PEPISACode getPEPOrISAPlan() {
		return pEPOrISAPlan;
	}

	public void setPEPOrISAPlan(PEPISACode pEPOrISAPlan) {
		this.pEPOrISAPlan = pEPOrISAPlan;
	}

	public ISATypeCode getCurrentYearISAType() {
		return currentYearISAType;
	}

	public void setCurrentYearISAType(ISATypeCode currentYearISAType) {
		this.currentYearISAType = currentYearISAType;
	}
}