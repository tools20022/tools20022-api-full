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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.CashSettlementInstructionPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Identification of a specific system or set of rules and/or processes to be
 * applied at the settlement place.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SettlementInstructionSystemRole"
 * src="doc-files/SettlementInstructionSystemRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#mmSystem
 * SettlementInstructionSystemRole.mmSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmSystemRole
 * CashClearingSystem.mmSystemRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#mmClearingSystem
 * SettlementInstruction4.mmClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction1#mmClearingSystem
 * SettlementInstruction1.mmClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#mmClearingSystem
 * SettlementInstruction2.mmClearingSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
 * CashSettlementInstructionPartyRole}</li>
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
 * "SettlementInstructionSystemRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a specific system or set of rules and/or processes to be applied at the settlement place."
 * </li>
 * </ul>
 */
public class SettlementInstructionSystemRole extends CashSettlementInstructionPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashClearingSystem> system;
	/**
	 * Specifies the system which plays a role in the settlement of a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmSystemRole
	 * CashClearingSystem.mmSystemRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole
	 * SettlementInstructionSystemRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmCashClearingSystem
	 * SettlementDetails50.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmCashClearingSystem
	 * SettlementDetails51.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmCashClearingSystem
	 * SettlementDetails9.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmCashClearingSystem
	 * SettlementDetails17.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmCashClearingSystem
	 * SettlementDetails30.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmCashClearingSystem
	 * SettlementDetails32.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmCashClearingSystem
	 * SettlementDetails60.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmCashClearingSystem
	 * SettlementDetails64.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmCashClearingSystem
	 * SettlementDetails3.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmCashClearingSystem
	 * SettlementDetails16.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmCashClearingSystem
	 * SettlementDetails31.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmCashClearingSystem
	 * SettlementDetails40.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmCashClearingSystem
	 * SettlementDetails62.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmCashClearingSystem
	 * SettlementDetails63.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmCashClearingSystem
	 * SettlementDetails6.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmCashClearingSystem
	 * SettlementDetails20.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmCashClearingSystem
	 * SettlementDetails24.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmCashClearingSystem
	 * SettlementDetails33.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmCashClearingSystem
	 * SettlementDetails45.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmCashClearingSystem
	 * SettlementDetails54.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmCashClearingSystem
	 * SettlementDetails1.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmCashClearingSystem
	 * SettlementDetails19.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmCashClearingSystem
	 * SettlementDetails22.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmCashClearingSystem
	 * SettlementDetails35.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmCashClearingSystem
	 * SettlementDetails42.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmCashClearingSystem
	 * SettlementDetails52.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmCashClearingSystem
	 * SettlementDetails8.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmCashClearingSystem
	 * SettlementDetails11.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmCashClearingSystem
	 * SettlementDetails23.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmCashClearingSystem
	 * SettlementDetails37.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmCashClearingSystem
	 * SettlementDetails44.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmCashClearingSystem
	 * SettlementDetails53.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmCashClearingSystem
	 * SettlementDetails7.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmCashClearingSystem
	 * SettlementDetails12.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmCashClearingSystem
	 * SettlementDetails28.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmCashClearingSystem
	 * SettlementDetails38.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmCashClearingSystem
	 * SettlementDetails47.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmCashClearingSystem
	 * SettlementDetails56.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmCashClearingSystem
	 * SettlementDetails2.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmCashClearingSystem
	 * SettlementDetails13.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmCashClearingSystem
	 * SettlementDetails27.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmCashClearingSystem
	 * SettlementDetails39.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmCashClearingSystem
	 * SettlementDetails48.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmCashClearingSystem
	 * SettlementDetails57.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmCashClearingSystem
	 * SettlementDetails43.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmCashClearingSystem
	 * SettlementDetails10.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmCashClearingSystem
	 * SettlementDetails29.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmCashClearingSystem
	 * SettlementDetails5.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#mmCashClearingSystem
	 * SettlementDetails25.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmCashClearingSystem
	 * SettlementDetails26.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmCashClearingSystem
	 * SettlementDetails65.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmCashClearingSystem
	 * SettlementDetails14.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmCashClearingSystem
	 * SettlementDetails41.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmCashClearingSystem
	 * SettlementDetails61.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmCashClearingSystem
	 * SettlementDetails59.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmCashClearingSystem
	 * SettlementDetails15.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#mmCashClearingSystem
	 * SettlementDetails34.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#mmCashClearingSystem
	 * SettlementDetails49.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#mmCashClearingSystem
	 * SettlementDetails58.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmCashClearingSystem
	 * SettlementDetails36.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmCashClearingSystem
	 * SettlementDetails66.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmCashClearingSystem
	 * SettlementDetails67.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmCashClearingSystem
	 * SettlementDetails70.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmCashClearingSystem
	 * SettlementDetails68.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmCashClearingSystem
	 * SettlementDetails69.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmCashClearingSystem
	 * SettlementDetails71.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmCashClearingSystem
	 * SettlementDetails72.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmCashClearingSystem
	 * SettlementDetails75.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmCashClearingSystem
	 * SettlementDetails73.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmCashClearingSystem
	 * SettlementDetails74.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmCashClearingSystem
	 * SettlementDetails81.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmCashClearingSystem
	 * SettlementDetails76.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmCashClearingSystem
	 * SettlementDetails80.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmCashClearingSystem
	 * SettlementDetails78.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmCashClearingSystem
	 * SettlementDetails77.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmCashClearingSystem
	 * SettlementDetails79.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmCashClearingSystem
	 * SettlementDetails87.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmCashClearingSystem
	 * SettlementDetails83.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmCashClearingSystem
	 * SettlementDetails86.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmCashClearingSystem
	 * SettlementDetails85.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmCashClearingSystem
	 * SettlementDetails93.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmCashClearingSystem
	 * SettlementDetails90.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmCashClearingSystem
	 * SettlementDetails96.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmCashClearingSystem
	 * SettlementDetails97.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#mmCashClearingSystem
	 * SettlementDetails99.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmCashClearingSystem
	 * SettlementDetails94.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmCashClearingSystem
	 * SettlementDetails95.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmCashClearingSystem
	 * SettlementDetails91.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmCashClearingSystem
	 * SettlementDetails92.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmCashClearingSystem
	 * SettlementDetails98.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmCashClearingSystem
	 * SettlementDetails101.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmCashClearingSystem
	 * SettlementDetails105.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmCashClearingSystem
	 * SettlementDetails106.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmCashClearingSystem
	 * SettlementDetails104.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmCashClearingSystem
	 * SettlementDetails111.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmCashClearingSystem
	 * SettlementDetails112.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmCashClearingSystem
	 * SettlementDetails110.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#mmCashClearingSystem
	 * SettlementDetails108.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmCashClearingSystem
	 * SettlementDetails107.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmCashClearingSystem
	 * SettlementDetails115.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmCashClearingSystem
	 * SettlementDetails117.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmCashClearingSystem
	 * SettlementDetails116.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmCashClearingSystem
	 * SettlementDetails113.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmCashClearingSystem
	 * SettlementDetails128.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmCashClearingSystem
	 * SettlementDetails120.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmCashClearingSystem
	 * SettlementDetails119.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmCashClearingSystem
	 * SettlementDetails125.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmCashClearingSystem
	 * SettlementDetails126.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmCashClearingSystem
	 * SettlementDetails122.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmCashClearingSystem
	 * SettlementDetails127.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmCashClearingSystem
	 * SettlementDetails121.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmCashClearingSystem
	 * SettlementDetails134.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmCashClearingSystem
	 * SettlementDetails137.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmCashClearingSystem
	 * SettlementDetails132.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmCashClearingSystem
	 * SettlementDetails138.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmCashClearingSystem
	 * SettlementDetails130.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#mmCashClearingSystem
	 * SettlementDetails131.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmCashClearingSystem
	 * SettlementDetails133.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmCashClearingSystem
	 * SettlementDetails139.mmCashClearingSystem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the system which plays a role in the settlement of a payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystem = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails51.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails9.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails17.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails30.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails32.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails60.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails64.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails3.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails16.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails31.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails40.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails62.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails63.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails6.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails20.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails24.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails33.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails45.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails54.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails1.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails19.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails22.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails35.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails42.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails52.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails8.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails11.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails23.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails37.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails44.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails53.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails7.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails12.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails28.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails38.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails47.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails56.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails2.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails13.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails27.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails39.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails48.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails57.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails43.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails10.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails29.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails5.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails25.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails26.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails65.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails14.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails41.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails61.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails59.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails15.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails34.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails49.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails58.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails36.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails66.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails67.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails70.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails68.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails69.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails71.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails72.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails75.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails73.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails74.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails81.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails76.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails80.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails78.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails77.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails79.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails87.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails83.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails86.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails85.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails93.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails90.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails96.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails97.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails99.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails94.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails95.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails91.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails92.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails98.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails101.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails105.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails106.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails104.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails111.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails112.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails110.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails108.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails107.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails115.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails117.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails116.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails113.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails128.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails120.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails119.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails125.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails126.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails122.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails127.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails121.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails134.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails137.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails132.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails138.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails130.mmCashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails131.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails133.mmCashClearingSystem, com.tools20022.repository.msg.SettlementDetails139.mmCashClearingSystem);
			elementContext_lazy = () -> SettlementInstructionSystemRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "Specifies the system which plays a role in the settlement of a payment.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.mmSystemRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementInstructionSystemRole";
				definition = "Identification of a specific system or set of rules and/or processes to be applied at the settlement place.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystem.mmSystemRole);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction4.mmClearingSystem, com.tools20022.repository.msg.SettlementInstruction1.mmClearingSystem,
						com.tools20022.repository.msg.SettlementInstruction2.mmClearingSystem);
				superType_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SettlementInstructionSystemRole.mmSystem);
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashClearingSystem> getSystem() {
		return system;
	}

	public void setSystem(List<com.tools20022.repository.entity.CashClearingSystem> system) {
		this.system = system;
	}
}