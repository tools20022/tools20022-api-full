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
 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole#System
 * SettlementInstructionSystemRole.System}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#SystemRole
 * CashClearingSystem.SystemRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction4#ClearingSystem
 * SettlementInstruction4.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction1#ClearingSystem
 * SettlementInstruction1.ClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInstruction2#ClearingSystem
 * SettlementInstruction2.ClearingSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
 * CashSettlementInstructionPartyRole}</li>
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
 * "SettlementInstructionSystemRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a specific system or set of rules and/or processes to be applied at the settlement place."
 * </li>
 * </ul>
 */
public class SettlementInstructionSystemRole extends CashSettlementInstructionPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the system which plays a role in the settlement of a payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#SystemRole
	 * CashClearingSystem.SystemRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#CashClearingSystem
	 * SettlementDetails50.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#CashClearingSystem
	 * SettlementDetails51.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#CashClearingSystem
	 * SettlementDetails9.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#CashClearingSystem
	 * SettlementDetails17.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#CashClearingSystem
	 * SettlementDetails30.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#CashClearingSystem
	 * SettlementDetails32.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#CashClearingSystem
	 * SettlementDetails60.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#CashClearingSystem
	 * SettlementDetails64.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#CashClearingSystem
	 * SettlementDetails3.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#CashClearingSystem
	 * SettlementDetails16.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#CashClearingSystem
	 * SettlementDetails31.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#CashClearingSystem
	 * SettlementDetails40.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#CashClearingSystem
	 * SettlementDetails62.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#CashClearingSystem
	 * SettlementDetails63.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#CashClearingSystem
	 * SettlementDetails6.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#CashClearingSystem
	 * SettlementDetails20.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#CashClearingSystem
	 * SettlementDetails24.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#CashClearingSystem
	 * SettlementDetails33.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#CashClearingSystem
	 * SettlementDetails45.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#CashClearingSystem
	 * SettlementDetails54.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#CashClearingSystem
	 * SettlementDetails1.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#CashClearingSystem
	 * SettlementDetails19.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#CashClearingSystem
	 * SettlementDetails22.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#CashClearingSystem
	 * SettlementDetails35.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#CashClearingSystem
	 * SettlementDetails42.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#CashClearingSystem
	 * SettlementDetails52.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#CashClearingSystem
	 * SettlementDetails8.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#CashClearingSystem
	 * SettlementDetails11.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#CashClearingSystem
	 * SettlementDetails23.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#CashClearingSystem
	 * SettlementDetails37.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#CashClearingSystem
	 * SettlementDetails44.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#CashClearingSystem
	 * SettlementDetails53.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#CashClearingSystem
	 * SettlementDetails7.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#CashClearingSystem
	 * SettlementDetails12.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#CashClearingSystem
	 * SettlementDetails28.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#CashClearingSystem
	 * SettlementDetails38.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#CashClearingSystem
	 * SettlementDetails47.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#CashClearingSystem
	 * SettlementDetails56.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#CashClearingSystem
	 * SettlementDetails2.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#CashClearingSystem
	 * SettlementDetails13.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#CashClearingSystem
	 * SettlementDetails27.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#CashClearingSystem
	 * SettlementDetails39.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#CashClearingSystem
	 * SettlementDetails48.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#CashClearingSystem
	 * SettlementDetails57.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#CashClearingSystem
	 * SettlementDetails43.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#CashClearingSystem
	 * SettlementDetails10.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#CashClearingSystem
	 * SettlementDetails29.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#CashClearingSystem
	 * SettlementDetails5.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#CashClearingSystem
	 * SettlementDetails25.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#CashClearingSystem
	 * SettlementDetails26.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#CashClearingSystem
	 * SettlementDetails65.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#CashClearingSystem
	 * SettlementDetails14.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#CashClearingSystem
	 * SettlementDetails41.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#CashClearingSystem
	 * SettlementDetails61.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#CashClearingSystem
	 * SettlementDetails59.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#CashClearingSystem
	 * SettlementDetails15.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#CashClearingSystem
	 * SettlementDetails34.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#CashClearingSystem
	 * SettlementDetails49.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#CashClearingSystem
	 * SettlementDetails58.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#CashClearingSystem
	 * SettlementDetails36.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#CashClearingSystem
	 * SettlementDetails66.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#CashClearingSystem
	 * SettlementDetails67.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#CashClearingSystem
	 * SettlementDetails70.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#CashClearingSystem
	 * SettlementDetails68.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#CashClearingSystem
	 * SettlementDetails69.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#CashClearingSystem
	 * SettlementDetails71.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#CashClearingSystem
	 * SettlementDetails72.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#CashClearingSystem
	 * SettlementDetails75.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#CashClearingSystem
	 * SettlementDetails73.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#CashClearingSystem
	 * SettlementDetails74.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#CashClearingSystem
	 * SettlementDetails81.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#CashClearingSystem
	 * SettlementDetails76.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#CashClearingSystem
	 * SettlementDetails80.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#CashClearingSystem
	 * SettlementDetails78.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#CashClearingSystem
	 * SettlementDetails77.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#CashClearingSystem
	 * SettlementDetails79.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#CashClearingSystem
	 * SettlementDetails87.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#CashClearingSystem
	 * SettlementDetails83.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#CashClearingSystem
	 * SettlementDetails86.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#CashClearingSystem
	 * SettlementDetails85.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#CashClearingSystem
	 * SettlementDetails93.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#CashClearingSystem
	 * SettlementDetails90.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#CashClearingSystem
	 * SettlementDetails96.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#CashClearingSystem
	 * SettlementDetails97.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#CashClearingSystem
	 * SettlementDetails99.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#CashClearingSystem
	 * SettlementDetails94.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#CashClearingSystem
	 * SettlementDetails95.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#CashClearingSystem
	 * SettlementDetails91.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#CashClearingSystem
	 * SettlementDetails92.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#CashClearingSystem
	 * SettlementDetails98.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#CashClearingSystem
	 * SettlementDetails101.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#CashClearingSystem
	 * SettlementDetails105.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#CashClearingSystem
	 * SettlementDetails106.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#CashClearingSystem
	 * SettlementDetails104.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#CashClearingSystem
	 * SettlementDetails111.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#CashClearingSystem
	 * SettlementDetails112.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#CashClearingSystem
	 * SettlementDetails110.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#CashClearingSystem
	 * SettlementDetails108.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#CashClearingSystem
	 * SettlementDetails107.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#CashClearingSystem
	 * SettlementDetails115.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#CashClearingSystem
	 * SettlementDetails117.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#CashClearingSystem
	 * SettlementDetails116.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#CashClearingSystem
	 * SettlementDetails113.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#CashClearingSystem
	 * SettlementDetails128.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#CashClearingSystem
	 * SettlementDetails120.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#CashClearingSystem
	 * SettlementDetails119.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#CashClearingSystem
	 * SettlementDetails125.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#CashClearingSystem
	 * SettlementDetails126.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#CashClearingSystem
	 * SettlementDetails122.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#CashClearingSystem
	 * SettlementDetails127.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#CashClearingSystem
	 * SettlementDetails121.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#CashClearingSystem
	 * SettlementDetails134.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#CashClearingSystem
	 * SettlementDetails137.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#CashClearingSystem
	 * SettlementDetails132.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#CashClearingSystem
	 * SettlementDetails138.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#CashClearingSystem
	 * SettlementDetails130.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#CashClearingSystem
	 * SettlementDetails131.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#CashClearingSystem
	 * SettlementDetails133.CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#CashClearingSystem
	 * SettlementDetails139.CashClearingSystem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole
	 * SettlementInstructionSystemRole}</li>
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
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails51.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails9.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails17.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails30.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails32.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails60.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails64.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails3.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails16.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails31.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails40.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails62.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails63.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails6.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails20.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails24.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails33.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails45.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails54.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails1.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails19.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails22.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails35.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails42.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails52.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails8.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails11.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails23.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails37.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails44.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails53.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails7.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails12.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails28.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails38.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails47.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails56.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails2.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails13.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails27.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails39.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails48.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails57.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails43.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails10.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails29.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails5.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails25.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails26.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails65.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails14.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails41.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails61.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails59.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails15.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails34.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails49.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails58.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails36.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails66.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails67.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails70.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails68.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails69.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails71.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails72.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails75.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails73.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails74.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails81.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails76.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails80.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails78.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails77.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails79.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails87.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails83.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails86.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails85.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails93.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails90.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails96.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails97.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails99.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails94.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails95.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails91.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails92.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails98.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails101.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails105.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails106.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails104.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails111.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails112.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails110.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails108.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails107.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails115.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails117.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails116.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails113.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails128.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails120.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails119.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails125.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails126.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails122.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails127.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails121.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails134.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails137.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails132.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails138.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails130.CashClearingSystem,
					com.tools20022.repository.msg.SettlementDetails131.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails133.CashClearingSystem, com.tools20022.repository.msg.SettlementDetails139.CashClearingSystem);
			elementContext_lazy = () -> SettlementInstructionSystemRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "Specifies the system which plays a role in the settlement of a payment.";
			minOccurs = 0;
			type_lazy = () -> CashClearingSystem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystem.SystemRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementInstructionSystemRole";
				definition = "Identification of a specific system or set of rules and/or processes to be applied at the settlement place.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystem.SystemRole);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInstruction4.ClearingSystem, com.tools20022.repository.msg.SettlementInstruction1.ClearingSystem,
						com.tools20022.repository.msg.SettlementInstruction2.ClearingSystem);
				superType_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SettlementInstructionSystemRole.System);
			}
		});
		return mmObject_lazy.get();
	}
}