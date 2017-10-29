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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.TradeOriginator1Choice;
import com.tools20022.repository.choice.TradeOriginator2Choice;
import com.tools20022.repository.choice.TradeOriginator3Choice;
import com.tools20022.repository.choice.TradeOriginator4Choice;
import com.tools20022.repository.codeset.OriginatorRoleCode;
import com.tools20022.repository.entity.TradePartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the trading party at the source of the transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradeOriginatorRole" src="doc-files/TradeOriginatorRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeOriginatorRole#OriginatorRole
 * TradeOriginatorRole.OriginatorRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#TradeOriginatorRole
 * SecuritiesTradeDetails25.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#TradeOriginatorRole
 * SecuritiesTradeDetails26.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#TradeOriginatorRole
 * SecuritiesTradeDetails27.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#TradeOriginatorRole
 * SecuritiesTradeDetails28.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#TradeOriginatorRole
 * SecuritiesTradeDetails6.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#TradeOriginatorRole
 * SecuritiesTradeDetails13.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#TradeOriginatorRole
 * SecuritiesTradeDetails3.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#TradeOriginatorRole
 * SecuritiesTradeDetails11.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#TradeOriginatorRole
 * SecuritiesTradeDetails2.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#TradeOriginatorRole
 * SecuritiesTradeDetails16.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#TradeOriginatorRole
 * SecuritiesTradeDetails1.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#TradeOriginatorRole
 * SecuritiesTradeDetails15.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#TradeOriginatorRole
 * SecuritiesTradeDetails31.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#TradeOriginatorRole
 * SecuritiesTradeDetails33.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#TradeOriginatorRole
 * SecuritiesTradeDetails38.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#TradeOriginatorRole
 * SecuritiesTradeDetails37.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#TradeOriginatorRole
 * SecuritiesTradeDetails34.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#TradeOriginatorRole
 * SecuritiesTradeDetails32.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#TradeOriginatorRole
 * SecuritiesTradeDetails44.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#TradeOriginatorRole
 * SecuritiesTradeDetails39.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#TradeOriginatorRole
 * SecuritiesTradeDetails43.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#TradeOriginatorRole
 * SecuritiesTradeDetails40.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#TradeOriginatorRole
 * SecuritiesTradeDetails46.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#TradeOriginatorRole
 * SecuritiesTradeDetails47.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#TradeOriginatorRole
 * SecuritiesTradeDetails51.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#TradeOriginatorRole
 * SecuritiesTradeDetails53.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#TradeOriginatorRole
 * SecuritiesTradeDetails55.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#TradeOriginatorRole
 * SecuritiesTradeDetails56.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#TradeOriginatorRole
 * SecuritiesTradeDetails52.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#TradeOriginatorRole
 * SecuritiesTradeDetails50.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#TradeOriginatorRole
 * SecuritiesTradeDetails59.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#TradeOriginatorRole
 * SecuritiesTradeDetails58.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#TradeOriginatorRole
 * SecuritiesTradeDetails63.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#TradeOriginatorRole
 * SecuritiesTradeDetails62.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#TradeOriginatorRole
 * SecuritiesTradeDetails65.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#TradeOriginatorRole
 * SecuritiesTradeDetails66.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#TradeOriginatorRole
 * SecuritiesTradeDetails67.TradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#TradeOriginatorRole
 * SecuritiesTradeDetails70.TradeOriginatorRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TradeOriginator1Choice
 * TradeOriginator1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeOriginator2Choice
 * TradeOriginator2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeOriginator3Choice
 * TradeOriginator3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TradeOriginator4Choice
 * TradeOriginator4Choice}</li>
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
 * "TradeOriginatorRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the trading party at the source of the transaction."
 * </li>
 * </ul>
 */
public class TradeOriginatorRole extends TradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the role of the trading party in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OriginatorRoleCode
	 * OriginatorRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator1Choice#Code
	 * TradeOriginator1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator1Choice#Proprietary
	 * TradeOriginator1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator2Choice#Code
	 * TradeOriginator2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator2Choice#Proprietary
	 * TradeOriginator2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator3Choice#Code
	 * TradeOriginator3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator3Choice#Proprietary
	 * TradeOriginator3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator4Choice#Code
	 * TradeOriginator4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator4Choice#Proprietary
	 * TradeOriginator4Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeOriginatorRole
	 * TradeOriginatorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginatorRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role of the trading party in the transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OriginatorRole = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradeOriginator1Choice.Code, com.tools20022.repository.choice.TradeOriginator1Choice.Proprietary,
					com.tools20022.repository.choice.TradeOriginator2Choice.Code, com.tools20022.repository.choice.TradeOriginator2Choice.Proprietary, com.tools20022.repository.choice.TradeOriginator3Choice.Code,
					com.tools20022.repository.choice.TradeOriginator3Choice.Proprietary, com.tools20022.repository.choice.TradeOriginator4Choice.Code, com.tools20022.repository.choice.TradeOriginator4Choice.Proprietary);
			elementContext_lazy = () -> TradeOriginatorRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginatorRole";
			definition = "Specifies the role of the trading party in the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OriginatorRoleCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TradeOriginatorRole";
				definition = "Specifies the trading party at the source of the transaction.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails25.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails26.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails27.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails28.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails6.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails13.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails3.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails11.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails2.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails16.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails1.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails15.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails31.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails33.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails38.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails37.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails34.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails32.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails44.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails39.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails43.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails40.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails46.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails47.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails51.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails53.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails55.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails56.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails52.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails50.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails59.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails58.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails63.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails62.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails65.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails66.TradeOriginatorRole,
						com.tools20022.repository.msg.SecuritiesTradeDetails67.TradeOriginatorRole, com.tools20022.repository.msg.SecuritiesTradeDetails70.TradeOriginatorRole);
				superType_lazy = () -> TradePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeOriginatorRole.OriginatorRole);
				derivationComponent_lazy = () -> Arrays.asList(TradeOriginator1Choice.mmObject(), TradeOriginator2Choice.mmObject(), TradeOriginator3Choice.mmObject(), TradeOriginator4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}