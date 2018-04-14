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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CashClearingSystem;
import com.tools20022.repository.entity.CashSettlementInstructionPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole
 * CashSettlementInstructionPartyRole}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInstructionSystemRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a specific system or set of rules and/or processes to be applied at the settlement place."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SettlementInstructionSystemRole extends CashSettlementInstructionPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CashClearingSystem> system;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem#mmSystemRole
	 * CashClearingSystem.mmSystemRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails140#mmCashClearingSystem
	 * SettlementDetails140.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails147#mmCashClearingSystem
	 * SettlementDetails147.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails142#mmCashClearingSystem
	 * SettlementDetails142.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails144#mmCashClearingSystem
	 * SettlementDetails144.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails148#mmCashClearingSystem
	 * SettlementDetails148.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails141#mmCashClearingSystem
	 * SettlementDetails141.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails145#mmCashClearingSystem
	 * SettlementDetails145.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails146#mmCashClearingSystem
	 * SettlementDetails146.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails143#mmCashClearingSystem
	 * SettlementDetails143.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails149#mmCashClearingSystem
	 * SettlementDetails149.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails150#mmCashClearingSystem
	 * SettlementDetails150.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails151#mmCashClearingSystem
	 * SettlementDetails151.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails152#mmCashClearingSystem
	 * SettlementDetails152.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails153#mmCashClearingSystem
	 * SettlementDetails153.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails155#mmCashClearingSystem
	 * SettlementDetails155.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails156#mmCashClearingSystem
	 * SettlementDetails156.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails157#mmCashClearingSystem
	 * SettlementDetails157.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails158#mmCashClearingSystem
	 * SettlementDetails158.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails160#mmCashClearingSystem
	 * SettlementDetails160.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails161#mmCashClearingSystem
	 * SettlementDetails161.mmCashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails162#mmCashClearingSystem
	 * SettlementDetails162.mmCashClearingSystem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SettlementInstructionSystemRole
	 * SettlementInstructionSystemRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the system which plays a role in the settlement of a payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SettlementInstructionSystemRole, List<CashClearingSystem>> mmSystem = new MMBusinessAssociationEnd<SettlementInstructionSystemRole, List<CashClearingSystem>>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails50.mmCashClearingSystem, SettlementDetails51.mmCashClearingSystem, SettlementDetails9.mmCashClearingSystem, SettlementDetails17.mmCashClearingSystem,
					SettlementDetails30.mmCashClearingSystem, SettlementDetails32.mmCashClearingSystem, SettlementDetails60.mmCashClearingSystem, SettlementDetails64.mmCashClearingSystem, SettlementDetails3.mmCashClearingSystem,
					SettlementDetails16.mmCashClearingSystem, SettlementDetails31.mmCashClearingSystem, SettlementDetails40.mmCashClearingSystem, SettlementDetails62.mmCashClearingSystem, SettlementDetails63.mmCashClearingSystem,
					SettlementDetails6.mmCashClearingSystem, SettlementDetails20.mmCashClearingSystem, SettlementDetails24.mmCashClearingSystem, SettlementDetails33.mmCashClearingSystem, SettlementDetails45.mmCashClearingSystem,
					SettlementDetails54.mmCashClearingSystem, SettlementDetails1.mmCashClearingSystem, SettlementDetails19.mmCashClearingSystem, SettlementDetails22.mmCashClearingSystem, SettlementDetails35.mmCashClearingSystem,
					SettlementDetails42.mmCashClearingSystem, SettlementDetails52.mmCashClearingSystem, SettlementDetails8.mmCashClearingSystem, SettlementDetails11.mmCashClearingSystem, SettlementDetails23.mmCashClearingSystem,
					SettlementDetails37.mmCashClearingSystem, SettlementDetails44.mmCashClearingSystem, SettlementDetails53.mmCashClearingSystem, SettlementDetails7.mmCashClearingSystem, SettlementDetails12.mmCashClearingSystem,
					SettlementDetails28.mmCashClearingSystem, SettlementDetails38.mmCashClearingSystem, SettlementDetails47.mmCashClearingSystem, SettlementDetails56.mmCashClearingSystem, SettlementDetails2.mmCashClearingSystem,
					SettlementDetails13.mmCashClearingSystem, SettlementDetails27.mmCashClearingSystem, SettlementDetails39.mmCashClearingSystem, SettlementDetails48.mmCashClearingSystem, SettlementDetails57.mmCashClearingSystem,
					SettlementDetails43.mmCashClearingSystem, SettlementDetails10.mmCashClearingSystem, SettlementDetails29.mmCashClearingSystem, SettlementDetails5.mmCashClearingSystem, SettlementDetails25.mmCashClearingSystem,
					SettlementDetails26.mmCashClearingSystem, SettlementDetails65.mmCashClearingSystem, SettlementDetails14.mmCashClearingSystem, SettlementDetails41.mmCashClearingSystem, SettlementDetails61.mmCashClearingSystem,
					SettlementDetails59.mmCashClearingSystem, SettlementDetails15.mmCashClearingSystem, SettlementDetails34.mmCashClearingSystem, SettlementDetails49.mmCashClearingSystem, SettlementDetails58.mmCashClearingSystem,
					SettlementDetails36.mmCashClearingSystem, SettlementDetails66.mmCashClearingSystem, SettlementDetails67.mmCashClearingSystem, SettlementDetails70.mmCashClearingSystem, SettlementDetails68.mmCashClearingSystem,
					SettlementDetails69.mmCashClearingSystem, SettlementDetails71.mmCashClearingSystem, SettlementDetails72.mmCashClearingSystem, SettlementDetails75.mmCashClearingSystem, SettlementDetails73.mmCashClearingSystem,
					SettlementDetails74.mmCashClearingSystem, SettlementDetails81.mmCashClearingSystem, SettlementDetails76.mmCashClearingSystem, SettlementDetails80.mmCashClearingSystem, SettlementDetails78.mmCashClearingSystem,
					SettlementDetails77.mmCashClearingSystem, SettlementDetails79.mmCashClearingSystem, SettlementDetails87.mmCashClearingSystem, SettlementDetails83.mmCashClearingSystem, SettlementDetails86.mmCashClearingSystem,
					SettlementDetails85.mmCashClearingSystem, SettlementDetails93.mmCashClearingSystem, SettlementDetails90.mmCashClearingSystem, SettlementDetails96.mmCashClearingSystem, SettlementDetails97.mmCashClearingSystem,
					SettlementDetails99.mmCashClearingSystem, SettlementDetails94.mmCashClearingSystem, SettlementDetails95.mmCashClearingSystem, SettlementDetails91.mmCashClearingSystem, SettlementDetails92.mmCashClearingSystem,
					SettlementDetails98.mmCashClearingSystem, SettlementDetails101.mmCashClearingSystem, SettlementDetails105.mmCashClearingSystem, SettlementDetails106.mmCashClearingSystem, SettlementDetails104.mmCashClearingSystem,
					SettlementDetails111.mmCashClearingSystem, SettlementDetails112.mmCashClearingSystem, SettlementDetails110.mmCashClearingSystem, SettlementDetails108.mmCashClearingSystem, SettlementDetails107.mmCashClearingSystem,
					SettlementDetails115.mmCashClearingSystem, SettlementDetails117.mmCashClearingSystem, SettlementDetails116.mmCashClearingSystem, SettlementDetails113.mmCashClearingSystem, SettlementDetails128.mmCashClearingSystem,
					SettlementDetails120.mmCashClearingSystem, SettlementDetails119.mmCashClearingSystem, SettlementDetails125.mmCashClearingSystem, SettlementDetails126.mmCashClearingSystem, SettlementDetails122.mmCashClearingSystem,
					SettlementDetails127.mmCashClearingSystem, SettlementDetails121.mmCashClearingSystem, SettlementDetails134.mmCashClearingSystem, SettlementDetails137.mmCashClearingSystem, SettlementDetails132.mmCashClearingSystem,
					SettlementDetails138.mmCashClearingSystem, SettlementDetails130.mmCashClearingSystem, SettlementDetails131.mmCashClearingSystem, SettlementDetails133.mmCashClearingSystem, SettlementDetails139.mmCashClearingSystem,
					SettlementDetails140.mmCashClearingSystem, SettlementDetails147.mmCashClearingSystem, SettlementDetails142.mmCashClearingSystem, SettlementDetails144.mmCashClearingSystem, SettlementDetails148.mmCashClearingSystem,
					SettlementDetails141.mmCashClearingSystem, SettlementDetails145.mmCashClearingSystem, SettlementDetails146.mmCashClearingSystem, SettlementDetails143.mmCashClearingSystem, SettlementDetails149.mmCashClearingSystem,
					SettlementDetails150.mmCashClearingSystem, SettlementDetails151.mmCashClearingSystem, SettlementDetails152.mmCashClearingSystem, SettlementDetails153.mmCashClearingSystem, SettlementDetails155.mmCashClearingSystem,
					SettlementDetails156.mmCashClearingSystem, SettlementDetails157.mmCashClearingSystem, SettlementDetails158.mmCashClearingSystem, SettlementDetails160.mmCashClearingSystem, SettlementDetails161.mmCashClearingSystem,
					SettlementDetails162.mmCashClearingSystem);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SettlementInstructionSystemRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "Specifies the system which plays a role in the settlement of a payment.";
			minOccurs = 0;
			opposite_lazy = () -> CashClearingSystem.mmSystemRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashClearingSystem.mmObject();
		}

		@Override
		public List<CashClearingSystem> getValue(SettlementInstructionSystemRole obj) {
			return obj.getSystem();
		}

		@Override
		public void setValue(SettlementInstructionSystemRole obj, List<CashClearingSystem> value) {
			obj.setSystem(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementInstructionSystemRole";
				definition = "Identification of a specific system or set of rules and/or processes to be applied at the settlement place.";
				associationDomain_lazy = () -> Arrays.asList(CashClearingSystem.mmSystemRole);
				derivationElement_lazy = () -> Arrays.asList(SettlementInstruction4.mmClearingSystem, SettlementInstruction1.mmClearingSystem, SettlementInstruction2.mmClearingSystem);
				superType_lazy = () -> CashSettlementInstructionPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SettlementInstructionSystemRole.mmSystem);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SettlementInstructionSystemRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashClearingSystem> getSystem() {
		return system == null ? system = new ArrayList<>() : system;
	}

	public SettlementInstructionSystemRole setSystem(List<CashClearingSystem> system) {
		this.system = Objects.requireNonNull(system);
		return this;
	}
}