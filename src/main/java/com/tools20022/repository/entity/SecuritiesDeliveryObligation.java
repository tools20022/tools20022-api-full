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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Obligation;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Obligation for one party to deliver securities to another party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesDeliveryObligation"
 * src="doc-files/SecuritiesDeliveryObligation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#CCPEligibility
 * SecuritiesDeliveryObligation.CCPEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#NettingEligibility
 * SecuritiesDeliveryObligation.NettingEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#TransferInstructionDate
 * SecuritiesDeliveryObligation.TransferInstructionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#TransferCurrency
 * SecuritiesDeliveryObligation.TransferCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedCorporateAction
 * SecuritiesDeliveryObligation.RelatedCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedCollateralMovement
 * SecuritiesDeliveryObligation.RelatedCollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesTradeExecution
 * SecuritiesDeliveryObligation.SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#RelatedPortfolioTransfer
 * SecuritiesDeliveryObligation.RelatedPortfolioTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesTransfer
 * SecuritiesDeliveryObligation.SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SettlementInstructionGeneration
 * SecuritiesDeliveryObligation.SettlementInstructionGeneration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SettlementDateCode
 * SecuritiesDeliveryObligation.SettlementDateCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#SecuritiesLending
 * SecuritiesDeliveryObligation.SecuritiesLending}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#SecuritiesDeliveryObligation
 * SecuritiesTransfer.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#SecuritiesDeliveryObligation
 * PortfolioTransfer.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#SecuritiesDeliveryObligation
 * SecuritiesTradeExecution.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SecuritiesProceedsMovement
 * CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#SecuritiesDeliveryObligation
 * SecuritiesLending.SecuritiesDeliveryObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#SecuritiesCollateralMovement
 * CollateralMovement.SecuritiesCollateralMovement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Obligation
 * Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.NettingEligibility1Choice
 * NettingEligibility1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.NettingEligibility2Choice
 * NettingEligibility2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.NettingEligibility3Choice
 * NettingEligibility3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.NettingEligibility4Choice
 * NettingEligibility4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.NettingEligibility5Choice
 * NettingEligibility5Choice}</li>
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
 * "SecuritiesDeliveryObligation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Obligation for one party to deliver securities to another party."</li>
 * </ul>
 */
public class SecuritiesDeliveryObligation extends Obligation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies whether the settlement transaction is CCP (Central
	 * Counterparty) eligible.
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#CCPEligibility
	 * SettlementDetails50.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#CCPEligibility
	 * SettlementDetails51.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#CCPEligibility
	 * SettlementDetails9.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#CCPEligibility
	 * SettlementDetails17.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#CCPEligibility
	 * SettlementDetails30.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#CCPEligibility
	 * SettlementDetails32.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#CCPEligibility
	 * SettlementDetails60.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#CCPEligibility
	 * SettlementDetails64.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#CCPEligibility
	 * SettlementDetails3.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#CCPEligibility
	 * SettlementDetails16.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#CCPEligibility
	 * SettlementDetails31.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#CCPEligibility
	 * SettlementDetails40.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#CCPEligibility
	 * SettlementDetails62.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#CCPEligibility
	 * SettlementDetails63.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#CCPEligibility
	 * SettlementDetails6.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#CCPEligibility
	 * SettlementDetails20.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#CCPEligibility
	 * SettlementDetails24.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#CCPEligibility
	 * SettlementDetails33.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#CCPEligibility
	 * SettlementDetails45.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#CCPEligibility
	 * SettlementDetails54.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#CCPEligibility
	 * SettlementDetails1.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#CCPEligibility
	 * SettlementDetails19.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#CCPEligibility
	 * SettlementDetails22.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#CCPEligibility
	 * SettlementDetails35.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#CCPEligibility
	 * SettlementDetails42.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#CCPEligibility
	 * SettlementDetails52.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#CCPEligibility
	 * SettlementDetails8.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#CCPEligibility
	 * SettlementDetails11.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#CCPEligibility
	 * SettlementDetails23.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#CCPEligibility
	 * SettlementDetails37.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#CCPEligibility
	 * SettlementDetails44.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#CCPEligibility
	 * SettlementDetails53.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#CCPEligibility
	 * SettlementDetails7.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#CCPEligibility
	 * SettlementDetails12.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#CCPEligibility
	 * SettlementDetails28.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#CCPEligibility
	 * SettlementDetails38.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#CCPEligibility
	 * SettlementDetails47.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#CCPEligibility
	 * SettlementDetails56.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#CCPEligibility
	 * SettlementDetails2.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#CCPEligibility
	 * SettlementDetails13.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#CCPEligibility
	 * SettlementDetails27.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#CCPEligibility
	 * SettlementDetails39.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#CCPEligibility
	 * SettlementDetails48.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#CCPEligibility
	 * SettlementDetails57.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#CCPEligibility
	 * SettlementDetails43.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#CCPEligibility
	 * SettlementDetails10.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#CCPEligibility
	 * SettlementDetails29.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#CCPEligibility
	 * SettlementDetails5.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#CCPEligibility
	 * SettlementDetails26.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#CCPEligibility
	 * SettlementDetails65.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#CCPEligibility
	 * SettlementDetails14.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#CCPEligibility
	 * SettlementDetails41.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#CCPEligibility
	 * SettlementDetails61.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#CCPEligibility
	 * SettlementDetails59.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#CCPEligibility
	 * SettlementDetails15.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#CCPEligibility
	 * SettlementDetails36.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#CCPEligibility
	 * SettlementDetails66.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#CCPEligibility
	 * SettlementDetails67.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#CCPEligibility
	 * SettlementDetails70.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#CCPEligibility
	 * SettlementDetails68.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#CCPEligibility
	 * SettlementDetails69.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#CCPEligibility
	 * SettlementDetails71.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#CCPEligibility
	 * SettlementDetails72.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#CCPEligibility
	 * SettlementDetails75.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#CCPEligibility
	 * SettlementDetails73.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#CCPEligibility
	 * SettlementDetails74.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#CCPEligibility
	 * SettlementDetails81.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#CCPEligibility
	 * SettlementDetails76.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#CCPEligibility
	 * SettlementDetails80.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#CCPEligibility
	 * SettlementDetails78.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#CCPEligibility
	 * SettlementDetails77.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#CCPEligibility
	 * SettlementDetails79.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#CCPEligibility
	 * SettlementDetails87.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#CCPEligibility
	 * SettlementDetails83.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#CCPEligibility
	 * SettlementDetails86.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#CCPEligibility
	 * SettlementDetails85.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#CCPEligibility
	 * SettlementDetails93.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#CCPEligibility
	 * SettlementDetails90.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#CCPEligibility
	 * SettlementDetails96.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#CCPEligibility
	 * SettlementDetails97.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#CCPEligibility
	 * SettlementDetails94.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#CCPEligibility
	 * SettlementDetails95.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#CCPEligibility
	 * SettlementDetails91.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#CCPEligibility
	 * SettlementDetails92.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#CCPEligibility
	 * SettlementDetails98.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#CCPEligibility
	 * SettlementDetails101.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#CCPEligibility
	 * SettlementDetails105.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#CCPEligibility
	 * SettlementDetails106.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#CCPEligibility
	 * SettlementDetails104.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#CCPEligibility
	 * SettlementDetails111.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#CCPEligibility
	 * SettlementDetails112.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#CCPEligibility
	 * SettlementDetails110.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#CCPEligibility
	 * SettlementDetails107.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#CCPEligibility
	 * SettlementDetails115.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#CCPEligibility
	 * SettlementDetails117.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#CCPEligibility
	 * SettlementDetails116.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#CCPEligibility
	 * SettlementDetails113.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#CCPEligibility
	 * SettlementDetails128.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#CCPEligibility
	 * SettlementDetails120.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#CCPEligibility
	 * SettlementDetails119.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#CCPEligibility
	 * SettlementDetails126.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#CCPEligibility
	 * SettlementDetails122.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#CCPEligibility
	 * SettlementDetails127.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#CCPEligibility
	 * SettlementDetails121.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#CCPEligibility
	 * SettlementDetails134.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#CCPEligibility
	 * SettlementDetails137.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#CCPEligibility
	 * SettlementDetails132.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#CCPEligibility
	 * SettlementDetails138.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#CCPEligibility
	 * SettlementDetails130.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#CCPEligibility
	 * SettlementDetails133.CCPEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#CCPEligibility
	 * SettlementDetails139.CCPEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CCPEligibility = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.CCPEligibility, com.tools20022.repository.msg.SettlementDetails51.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails9.CCPEligibility, com.tools20022.repository.msg.SettlementDetails17.CCPEligibility, com.tools20022.repository.msg.SettlementDetails30.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails32.CCPEligibility, com.tools20022.repository.msg.SettlementDetails60.CCPEligibility, com.tools20022.repository.msg.SettlementDetails64.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails3.CCPEligibility, com.tools20022.repository.msg.SettlementDetails16.CCPEligibility, com.tools20022.repository.msg.SettlementDetails31.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails40.CCPEligibility, com.tools20022.repository.msg.SettlementDetails62.CCPEligibility, com.tools20022.repository.msg.SettlementDetails63.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails6.CCPEligibility, com.tools20022.repository.msg.SettlementDetails20.CCPEligibility, com.tools20022.repository.msg.SettlementDetails24.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails33.CCPEligibility, com.tools20022.repository.msg.SettlementDetails45.CCPEligibility, com.tools20022.repository.msg.SettlementDetails54.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails1.CCPEligibility, com.tools20022.repository.msg.SettlementDetails19.CCPEligibility, com.tools20022.repository.msg.SettlementDetails22.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails35.CCPEligibility, com.tools20022.repository.msg.SettlementDetails42.CCPEligibility, com.tools20022.repository.msg.SettlementDetails52.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails8.CCPEligibility, com.tools20022.repository.msg.SettlementDetails11.CCPEligibility, com.tools20022.repository.msg.SettlementDetails23.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails37.CCPEligibility, com.tools20022.repository.msg.SettlementDetails44.CCPEligibility, com.tools20022.repository.msg.SettlementDetails53.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails7.CCPEligibility, com.tools20022.repository.msg.SettlementDetails12.CCPEligibility, com.tools20022.repository.msg.SettlementDetails28.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails38.CCPEligibility, com.tools20022.repository.msg.SettlementDetails47.CCPEligibility, com.tools20022.repository.msg.SettlementDetails56.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails2.CCPEligibility, com.tools20022.repository.msg.SettlementDetails13.CCPEligibility, com.tools20022.repository.msg.SettlementDetails27.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails39.CCPEligibility, com.tools20022.repository.msg.SettlementDetails48.CCPEligibility, com.tools20022.repository.msg.SettlementDetails57.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails43.CCPEligibility, com.tools20022.repository.msg.SettlementDetails10.CCPEligibility, com.tools20022.repository.msg.SettlementDetails29.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails5.CCPEligibility, com.tools20022.repository.msg.SettlementDetails26.CCPEligibility, com.tools20022.repository.msg.SettlementDetails65.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails14.CCPEligibility, com.tools20022.repository.msg.SettlementDetails41.CCPEligibility, com.tools20022.repository.msg.SettlementDetails61.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails59.CCPEligibility, com.tools20022.repository.msg.SettlementDetails15.CCPEligibility, com.tools20022.repository.msg.SettlementDetails36.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails66.CCPEligibility, com.tools20022.repository.msg.SettlementDetails67.CCPEligibility, com.tools20022.repository.msg.SettlementDetails70.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails68.CCPEligibility, com.tools20022.repository.msg.SettlementDetails69.CCPEligibility, com.tools20022.repository.msg.SettlementDetails71.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails72.CCPEligibility, com.tools20022.repository.msg.SettlementDetails75.CCPEligibility, com.tools20022.repository.msg.SettlementDetails73.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails74.CCPEligibility, com.tools20022.repository.msg.SettlementDetails81.CCPEligibility, com.tools20022.repository.msg.SettlementDetails76.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails80.CCPEligibility, com.tools20022.repository.msg.SettlementDetails78.CCPEligibility, com.tools20022.repository.msg.SettlementDetails77.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails79.CCPEligibility, com.tools20022.repository.msg.SettlementDetails87.CCPEligibility, com.tools20022.repository.msg.SettlementDetails83.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails86.CCPEligibility, com.tools20022.repository.msg.SettlementDetails85.CCPEligibility, com.tools20022.repository.msg.SettlementDetails93.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails90.CCPEligibility, com.tools20022.repository.msg.SettlementDetails96.CCPEligibility, com.tools20022.repository.msg.SettlementDetails97.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails94.CCPEligibility, com.tools20022.repository.msg.SettlementDetails95.CCPEligibility, com.tools20022.repository.msg.SettlementDetails91.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails92.CCPEligibility, com.tools20022.repository.msg.SettlementDetails98.CCPEligibility, com.tools20022.repository.msg.SettlementDetails101.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails105.CCPEligibility, com.tools20022.repository.msg.SettlementDetails106.CCPEligibility, com.tools20022.repository.msg.SettlementDetails104.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails111.CCPEligibility, com.tools20022.repository.msg.SettlementDetails112.CCPEligibility, com.tools20022.repository.msg.SettlementDetails110.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails107.CCPEligibility, com.tools20022.repository.msg.SettlementDetails115.CCPEligibility, com.tools20022.repository.msg.SettlementDetails117.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails116.CCPEligibility, com.tools20022.repository.msg.SettlementDetails113.CCPEligibility, com.tools20022.repository.msg.SettlementDetails128.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails120.CCPEligibility, com.tools20022.repository.msg.SettlementDetails119.CCPEligibility, com.tools20022.repository.msg.SettlementDetails126.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails122.CCPEligibility, com.tools20022.repository.msg.SettlementDetails127.CCPEligibility, com.tools20022.repository.msg.SettlementDetails121.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails134.CCPEligibility, com.tools20022.repository.msg.SettlementDetails137.CCPEligibility, com.tools20022.repository.msg.SettlementDetails132.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails138.CCPEligibility, com.tools20022.repository.msg.SettlementDetails130.CCPEligibility, com.tools20022.repository.msg.SettlementDetails133.CCPEligibility,
					com.tools20022.repository.msg.SettlementDetails139.CCPEligibility);
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CCPEligibility";
			definition = "Specifies whether the settlement transaction is CCP (Central Counterparty) eligible.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the settlement transaction is eligible for netting.
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
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility1Choice#Indicator
	 * NettingEligibility1Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#NettingEligibility
	 * SettlementDetails50.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility2Choice#Indicator
	 * NettingEligibility2Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#NettingEligibility
	 * SettlementDetails51.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#NettingEligibility
	 * SettlementDetails9.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#NettingEligibility
	 * SettlementDetails17.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#NettingEligibility
	 * SettlementDetails30.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#NettingEligibility
	 * SettlementDetails32.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#NettingEligibility
	 * SettlementDetails60.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#NettingEligibility
	 * SettlementDetails64.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#NettingEligibility
	 * SettlementDetails3.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#NettingEligibility
	 * SettlementDetails16.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#NettingEligibility
	 * SettlementDetails31.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#NettingEligibility
	 * SettlementDetails40.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#NettingEligibility
	 * SettlementDetails62.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#NettingEligibility
	 * SettlementDetails63.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#NettingEligibility
	 * SettlementDetails6.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#NettingEligibility
	 * SettlementDetails20.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#NettingEligibility
	 * SettlementDetails24.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#NettingEligibility
	 * SettlementDetails33.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#NettingEligibility
	 * SettlementDetails45.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#NettingEligibility
	 * SettlementDetails54.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#NettingEligibility
	 * SettlementDetails1.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#NettingEligibility
	 * SettlementDetails19.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#NettingEligibility
	 * SettlementDetails22.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#NettingEligibility
	 * SettlementDetails35.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#NettingEligibility
	 * SettlementDetails42.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#NettingEligibility
	 * SettlementDetails52.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#NettingEligibility
	 * SettlementDetails8.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#NettingEligibility
	 * SettlementDetails11.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#NettingEligibility
	 * SettlementDetails23.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#NettingEligibility
	 * SettlementDetails37.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#NettingEligibility
	 * SettlementDetails44.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#NettingEligibility
	 * SettlementDetails53.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#NettingEligibility
	 * SettlementDetails7.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#NettingEligibility
	 * SettlementDetails12.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#NettingEligibility
	 * SettlementDetails28.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#NettingEligibility
	 * SettlementDetails38.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#NettingEligibility
	 * SettlementDetails47.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#NettingEligibility
	 * SettlementDetails56.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#NettingEligibility
	 * SettlementDetails2.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#NettingEligibility
	 * SettlementDetails13.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#NettingEligibility
	 * SettlementDetails27.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#NettingEligibility
	 * SettlementDetails39.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#NettingEligibility
	 * SettlementDetails48.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#NettingEligibility
	 * SettlementDetails57.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility3Choice#Indicator
	 * NettingEligibility3Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#NettingEligibility
	 * SettlementDetails43.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#NettingEligibility
	 * SettlementDetails10.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#NettingEligibility
	 * SettlementDetails29.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#NettingEligibility
	 * SettlementDetails5.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#NettingEligibility
	 * SettlementDetails26.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#NettingEligibility
	 * SettlementDetails65.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#NettingEligibility
	 * SettlementDetails14.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#NettingEligibility
	 * SettlementDetails41.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#NettingEligibility
	 * SettlementDetails61.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#NettingEligibility
	 * SettlementDetails59.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#NettingEligibility
	 * SettlementDetails15.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#NettingEligibility
	 * SettlementDetails36.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#NettingEligibility
	 * SettlementDetails66.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#NettingEligibility
	 * SettlementDetails67.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#NettingEligibility
	 * SettlementDetails70.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#NettingEligibility
	 * SettlementDetails68.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#NettingEligibility
	 * SettlementDetails69.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#NettingEligibility
	 * SettlementDetails71.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#NettingEligibility
	 * SettlementDetails72.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#NettingEligibility
	 * SettlementDetails75.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#NettingEligibility
	 * SettlementDetails73.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#NettingEligibility
	 * SettlementDetails74.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#NettingEligibility
	 * SettlementDetails81.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#NettingEligibility
	 * SettlementDetails76.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#NettingEligibility
	 * SettlementDetails80.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#NettingEligibility
	 * SettlementDetails78.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#NettingEligibility
	 * SettlementDetails77.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#NettingEligibility
	 * SettlementDetails79.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#NettingEligibility
	 * SettlementDetails87.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#NettingEligibility
	 * SettlementDetails83.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#NettingEligibility
	 * SettlementDetails86.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#NettingEligibility
	 * SettlementDetails85.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#NettingEligibility
	 * SettlementDetails93.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#NettingEligibility
	 * SettlementDetails90.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#NettingEligibility
	 * SettlementDetails96.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#NettingEligibility
	 * SettlementDetails97.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#NettingEligibility
	 * SettlementDetails94.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility4Choice#Indicator
	 * NettingEligibility4Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#NettingEligibility
	 * SettlementDetails95.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#NettingEligibility
	 * SettlementDetails91.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#NettingEligibility
	 * SettlementDetails92.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#NettingEligibility
	 * SettlementDetails98.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#NettingEligibility
	 * SettlementDetails101.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#NettingEligibility
	 * SettlementDetails105.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#NettingEligibility
	 * SettlementDetails106.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#NettingEligibility
	 * SettlementDetails104.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#NettingEligibility
	 * SettlementDetails111.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#NettingEligibility
	 * SettlementDetails112.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#NettingEligibility
	 * SettlementDetails110.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#NettingEligibility
	 * SettlementDetails107.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#NettingEligibility
	 * SettlementDetails115.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#NettingEligibility
	 * SettlementDetails117.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#NettingEligibility
	 * SettlementDetails116.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NettingEligibility5Choice#Indicator
	 * NettingEligibility5Choice.Indicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#NettingEligibility
	 * SettlementDetails113.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#NettingEligibility
	 * SettlementDetails128.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#NettingEligibility
	 * SettlementDetails120.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#NettingEligibility
	 * SettlementDetails119.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#NettingEligibility
	 * SettlementDetails126.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#NettingEligibility
	 * SettlementDetails122.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#NettingEligibility
	 * SettlementDetails127.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#NettingEligibility
	 * SettlementDetails121.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#NettingEligibility
	 * SettlementDetails134.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#NettingEligibility
	 * SettlementDetails137.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#NettingEligibility
	 * SettlementDetails132.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#NettingEligibility
	 * SettlementDetails138.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#NettingEligibility
	 * SettlementDetails130.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#NettingEligibility
	 * SettlementDetails133.NettingEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#NettingEligibility
	 * SettlementDetails139.NettingEligibility}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NettingEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is eligible for netting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NettingEligibility = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NettingEligibility1Choice.Indicator, com.tools20022.repository.msg.SettlementDetails50.NettingEligibility,
					com.tools20022.repository.choice.NettingEligibility2Choice.Indicator, com.tools20022.repository.msg.SettlementDetails51.NettingEligibility, com.tools20022.repository.msg.SettlementDetails9.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails17.NettingEligibility, com.tools20022.repository.msg.SettlementDetails30.NettingEligibility, com.tools20022.repository.msg.SettlementDetails32.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails60.NettingEligibility, com.tools20022.repository.msg.SettlementDetails64.NettingEligibility, com.tools20022.repository.msg.SettlementDetails3.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails16.NettingEligibility, com.tools20022.repository.msg.SettlementDetails31.NettingEligibility, com.tools20022.repository.msg.SettlementDetails40.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails62.NettingEligibility, com.tools20022.repository.msg.SettlementDetails63.NettingEligibility, com.tools20022.repository.msg.SettlementDetails6.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails20.NettingEligibility, com.tools20022.repository.msg.SettlementDetails24.NettingEligibility, com.tools20022.repository.msg.SettlementDetails33.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails45.NettingEligibility, com.tools20022.repository.msg.SettlementDetails54.NettingEligibility, com.tools20022.repository.msg.SettlementDetails1.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails19.NettingEligibility, com.tools20022.repository.msg.SettlementDetails22.NettingEligibility, com.tools20022.repository.msg.SettlementDetails35.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails42.NettingEligibility, com.tools20022.repository.msg.SettlementDetails52.NettingEligibility, com.tools20022.repository.msg.SettlementDetails8.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails11.NettingEligibility, com.tools20022.repository.msg.SettlementDetails23.NettingEligibility, com.tools20022.repository.msg.SettlementDetails37.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails44.NettingEligibility, com.tools20022.repository.msg.SettlementDetails53.NettingEligibility, com.tools20022.repository.msg.SettlementDetails7.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails12.NettingEligibility, com.tools20022.repository.msg.SettlementDetails28.NettingEligibility, com.tools20022.repository.msg.SettlementDetails38.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails47.NettingEligibility, com.tools20022.repository.msg.SettlementDetails56.NettingEligibility, com.tools20022.repository.msg.SettlementDetails2.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails13.NettingEligibility, com.tools20022.repository.msg.SettlementDetails27.NettingEligibility, com.tools20022.repository.msg.SettlementDetails39.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails48.NettingEligibility, com.tools20022.repository.msg.SettlementDetails57.NettingEligibility, com.tools20022.repository.choice.NettingEligibility3Choice.Indicator,
					com.tools20022.repository.msg.SettlementDetails43.NettingEligibility, com.tools20022.repository.msg.SettlementDetails10.NettingEligibility, com.tools20022.repository.msg.SettlementDetails29.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails5.NettingEligibility, com.tools20022.repository.msg.SettlementDetails26.NettingEligibility, com.tools20022.repository.msg.SettlementDetails65.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails14.NettingEligibility, com.tools20022.repository.msg.SettlementDetails41.NettingEligibility, com.tools20022.repository.msg.SettlementDetails61.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails59.NettingEligibility, com.tools20022.repository.msg.SettlementDetails15.NettingEligibility, com.tools20022.repository.msg.SettlementDetails36.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails66.NettingEligibility, com.tools20022.repository.msg.SettlementDetails67.NettingEligibility, com.tools20022.repository.msg.SettlementDetails70.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails68.NettingEligibility, com.tools20022.repository.msg.SettlementDetails69.NettingEligibility, com.tools20022.repository.msg.SettlementDetails71.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails72.NettingEligibility, com.tools20022.repository.msg.SettlementDetails75.NettingEligibility, com.tools20022.repository.msg.SettlementDetails73.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails74.NettingEligibility, com.tools20022.repository.msg.SettlementDetails81.NettingEligibility, com.tools20022.repository.msg.SettlementDetails76.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails80.NettingEligibility, com.tools20022.repository.msg.SettlementDetails78.NettingEligibility, com.tools20022.repository.msg.SettlementDetails77.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails79.NettingEligibility, com.tools20022.repository.msg.SettlementDetails87.NettingEligibility, com.tools20022.repository.msg.SettlementDetails83.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails86.NettingEligibility, com.tools20022.repository.msg.SettlementDetails85.NettingEligibility, com.tools20022.repository.msg.SettlementDetails93.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails90.NettingEligibility, com.tools20022.repository.msg.SettlementDetails96.NettingEligibility, com.tools20022.repository.msg.SettlementDetails97.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails94.NettingEligibility, com.tools20022.repository.choice.NettingEligibility4Choice.Indicator, com.tools20022.repository.msg.SettlementDetails95.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails91.NettingEligibility, com.tools20022.repository.msg.SettlementDetails92.NettingEligibility, com.tools20022.repository.msg.SettlementDetails98.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails101.NettingEligibility, com.tools20022.repository.msg.SettlementDetails105.NettingEligibility, com.tools20022.repository.msg.SettlementDetails106.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails104.NettingEligibility, com.tools20022.repository.msg.SettlementDetails111.NettingEligibility, com.tools20022.repository.msg.SettlementDetails112.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails110.NettingEligibility, com.tools20022.repository.msg.SettlementDetails107.NettingEligibility, com.tools20022.repository.msg.SettlementDetails115.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails117.NettingEligibility, com.tools20022.repository.msg.SettlementDetails116.NettingEligibility, com.tools20022.repository.choice.NettingEligibility5Choice.Indicator,
					com.tools20022.repository.msg.SettlementDetails113.NettingEligibility, com.tools20022.repository.msg.SettlementDetails128.NettingEligibility, com.tools20022.repository.msg.SettlementDetails120.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails119.NettingEligibility, com.tools20022.repository.msg.SettlementDetails126.NettingEligibility, com.tools20022.repository.msg.SettlementDetails122.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails127.NettingEligibility, com.tools20022.repository.msg.SettlementDetails121.NettingEligibility, com.tools20022.repository.msg.SettlementDetails134.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails137.NettingEligibility, com.tools20022.repository.msg.SettlementDetails132.NettingEligibility, com.tools20022.repository.msg.SettlementDetails138.NettingEligibility,
					com.tools20022.repository.msg.SettlementDetails130.NettingEligibility, com.tools20022.repository.msg.SettlementDetails133.NettingEligibility, com.tools20022.repository.msg.SettlementDetails139.NettingEligibility);
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NettingEligibility";
			definition = "Specifies whether the settlement transaction is eligible for netting.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date at which the instructing party places the transfer instruction.
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
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer3#TransferDate
	 * Transfer3.TransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer6#TransferDate
	 * Transfer6.TransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer16#TransferDate
	 * Transfer16.TransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer22#TransferDate
	 * Transfer22.TransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer5#TransferDate
	 * Transfer5.TransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer15#TransferDate
	 * Transfer15.TransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer21#TransferDate
	 * Transfer21.TransferDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer32#TransferDate
	 * Transfer32.TransferDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferInstructionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the instructing party places the transfer instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferInstructionDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer3.TransferDate, com.tools20022.repository.msg.Transfer6.TransferDate, com.tools20022.repository.msg.Transfer16.TransferDate,
					com.tools20022.repository.msg.Transfer22.TransferDate, com.tools20022.repository.msg.Transfer5.TransferDate, com.tools20022.repository.msg.Transfer15.TransferDate, com.tools20022.repository.msg.Transfer21.TransferDate,
					com.tools20022.repository.msg.Transfer32.TransferDate);
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferInstructionDate";
			definition = "Date at which the instructing party places the transfer instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Identifies the currency to be used to transfer the holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer18#TransferCurrency
	 * Transfer18.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer26#TransferCurrency
	 * Transfer26.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer13#TransferCurrency
	 * Transfer13.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer23#TransferCurrency
	 * Transfer23.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer11#TransferCurrency
	 * Transfer11.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer19#TransferCurrency
	 * Transfer19.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer27#TransferCurrency
	 * Transfer27.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer28#TransferCurrency
	 * Transfer28.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer29#TransferCurrency
	 * Transfer29.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#TransferCurrency
	 * FinancialInstrument40.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#TransferCurrency
	 * FinancialInstrument39.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer31#TransferCurrency
	 * Transfer31.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer30#TransferCurrency
	 * Transfer30.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer33#TransferCurrency
	 * Transfer33.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#TransferCurrency
	 * FinancialInstrument48.TransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#TransferCurrency
	 * FinancialInstrument46.TransferCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the currency to be used to transfer the holdings."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransferCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer18.TransferCurrency, com.tools20022.repository.msg.Transfer26.TransferCurrency, com.tools20022.repository.msg.Transfer13.TransferCurrency,
					com.tools20022.repository.msg.Transfer23.TransferCurrency, com.tools20022.repository.msg.Transfer11.TransferCurrency, com.tools20022.repository.msg.Transfer19.TransferCurrency,
					com.tools20022.repository.msg.Transfer27.TransferCurrency, com.tools20022.repository.msg.Transfer28.TransferCurrency, com.tools20022.repository.msg.Transfer29.TransferCurrency,
					com.tools20022.repository.msg.FinancialInstrument40.TransferCurrency, com.tools20022.repository.msg.FinancialInstrument39.TransferCurrency, com.tools20022.repository.msg.Transfer31.TransferCurrency,
					com.tools20022.repository.msg.Transfer30.TransferCurrency, com.tools20022.repository.msg.Transfer33.TransferCurrency, com.tools20022.repository.msg.FinancialInstrument48.TransferCurrency,
					com.tools20022.repository.msg.FinancialInstrument46.TransferCurrency);
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferCurrency";
			definition = "Identifies the currency to be used to transfer the holdings.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Corporate action processes which are the source of the securities
	 * delivery obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction#SecuritiesProceedsMovement
	 * CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction
	 * CorporateActionProceedsDeliveryInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action processes which are the source of the securities delivery obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateAction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateAction";
			definition = "Corporate action processes which are the source of the securities delivery obligation.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionProceedsDeliveryInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral movement which is the source of the obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#SecuritiesCollateralMovement
	 * CollateralMovement.SecuritiesCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral movement which is the source of the obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCollateralMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralMovement";
			definition = "Collateral movement which is the source of the obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CollateralMovement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.SecuritiesCollateralMovement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the trade which originates the delivery obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#SecuritiesDeliveryObligation
	 * SecuritiesTradeExecution.SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the delivery obligation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Specifies the trade which originates the delivery obligation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Portfolio transfer which is the source of the securities delivery
	 * obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PortfolioTransfer#SecuritiesDeliveryObligation
	 * PortfolioTransfer.SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PortfolioTransfer
	 * PortfolioTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPortfolioTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portfolio transfer which is the source of the securities delivery obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPortfolioTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPortfolioTransfer";
			definition = "Portfolio transfer which is the source of the securities delivery obligation.";
			minOccurs = 0;
			type_lazy = () -> PortfolioTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PortfolioTransfer.SecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Completion of a securities settlement instruction, wherein securities are
	 * delivered/debited from a securities account and received/credited to the
	 * designated securities account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#SecuritiesDeliveryObligation
	 * SecuritiesTransfer.SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#SecuritiesMovementDetails
	 * CorporateActionElection3.SecuritiesMovementDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionElection3.SecuritiesMovementDetails);
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.SecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the ETC provider should generate settlement
	 * instructions or not.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionGeneration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the ETC provider should generate settlement instructions or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementInstructionGeneration = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementInstructionGeneration";
			definition = "Specifies whether the ETC provider should generate settlement instructions or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Requested date of trade settlement, in coded form, for example, trade
	 * date +1).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#LegSettlementDateCode
	 * InstrumentLeg2.LegSettlementDateCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDateCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested date of trade settlement, in coded form, for example, trade date +1)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementDateCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstrumentLeg2.LegSettlementDateCode);
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDateCode";
			definition = "Requested date of trade settlement, in coded form, for example, trade date +1).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
		}
	};
	/**
	 * Securities lending process which covers the delivery of securities by the
	 * seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesLending#SecuritiesDeliveryObligation
	 * SecuritiesLending.SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesLending
	 * SecuritiesLending}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation
	 * SecuritiesDeliveryObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities lending process which covers the delivery of securities by the seller."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesLending = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesDeliveryObligation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLending";
			definition = "Securities lending process which covers the delivery of securities by the seller.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesLending.SecuritiesDeliveryObligation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesDeliveryObligation";
				definition = "Obligation for one party to deliver securities to another party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTransfer.SecuritiesDeliveryObligation, com.tools20022.repository.entity.PortfolioTransfer.SecuritiesDeliveryObligation,
						com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesDeliveryObligation, com.tools20022.repository.entity.CorporateActionProceedsDeliveryInstruction.SecuritiesProceedsMovement,
						com.tools20022.repository.entity.SecuritiesLending.SecuritiesDeliveryObligation, com.tools20022.repository.entity.CollateralMovement.SecuritiesCollateralMovement);
				superType_lazy = () -> Obligation.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesDeliveryObligation.CCPEligibility, com.tools20022.repository.entity.SecuritiesDeliveryObligation.NettingEligibility,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.TransferInstructionDate, com.tools20022.repository.entity.SecuritiesDeliveryObligation.TransferCurrency,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCorporateAction, com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedCollateralMovement,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesDeliveryObligation.RelatedPortfolioTransfer,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesTransfer, com.tools20022.repository.entity.SecuritiesDeliveryObligation.SettlementInstructionGeneration,
						com.tools20022.repository.entity.SecuritiesDeliveryObligation.SettlementDateCode, com.tools20022.repository.entity.SecuritiesDeliveryObligation.SecuritiesLending);
				derivationComponent_lazy = () -> Arrays.asList(NettingEligibility1Choice.mmObject(), NettingEligibility2Choice.mmObject(), NettingEligibility3Choice.mmObject(), NettingEligibility4Choice.mmObject(),
						NettingEligibility5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}