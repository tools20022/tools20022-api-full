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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.TradeOriginator1Choice;
import com.tools20022.repository.choice.TradeOriginator2Choice;
import com.tools20022.repository.choice.TradeOriginator3Choice;
import com.tools20022.repository.choice.TradeOriginator4Choice;
import com.tools20022.repository.codeset.OriginatorRoleCode;
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.entity.TradeOriginatorRole#mmOriginatorRole
 * TradeOriginatorRole.mmOriginatorRole}</li>
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmTradeOriginatorRole
 * SecuritiesTradeDetails25.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmTradeOriginatorRole
 * SecuritiesTradeDetails26.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmTradeOriginatorRole
 * SecuritiesTradeDetails27.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmTradeOriginatorRole
 * SecuritiesTradeDetails28.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails6#mmTradeOriginatorRole
 * SecuritiesTradeDetails6.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails13#mmTradeOriginatorRole
 * SecuritiesTradeDetails13.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails3#mmTradeOriginatorRole
 * SecuritiesTradeDetails3.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails11#mmTradeOriginatorRole
 * SecuritiesTradeDetails11.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmTradeOriginatorRole
 * SecuritiesTradeDetails2.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmTradeOriginatorRole
 * SecuritiesTradeDetails16.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmTradeOriginatorRole
 * SecuritiesTradeDetails1.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmTradeOriginatorRole
 * SecuritiesTradeDetails15.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmTradeOriginatorRole
 * SecuritiesTradeDetails31.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmTradeOriginatorRole
 * SecuritiesTradeDetails33.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails38#mmTradeOriginatorRole
 * SecuritiesTradeDetails38.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails37#mmTradeOriginatorRole
 * SecuritiesTradeDetails37.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmTradeOriginatorRole
 * SecuritiesTradeDetails34.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmTradeOriginatorRole
 * SecuritiesTradeDetails32.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmTradeOriginatorRole
 * SecuritiesTradeDetails44.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails39#mmTradeOriginatorRole
 * SecuritiesTradeDetails39.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmTradeOriginatorRole
 * SecuritiesTradeDetails43.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails40#mmTradeOriginatorRole
 * SecuritiesTradeDetails40.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmTradeOriginatorRole
 * SecuritiesTradeDetails46.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmTradeOriginatorRole
 * SecuritiesTradeDetails47.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTradeOriginatorRole
 * SecuritiesTradeDetails51.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmTradeOriginatorRole
 * SecuritiesTradeDetails53.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails55#mmTradeOriginatorRole
 * SecuritiesTradeDetails55.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails56#mmTradeOriginatorRole
 * SecuritiesTradeDetails56.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmTradeOriginatorRole
 * SecuritiesTradeDetails52.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmTradeOriginatorRole
 * SecuritiesTradeDetails50.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails59#mmTradeOriginatorRole
 * SecuritiesTradeDetails59.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails58#mmTradeOriginatorRole
 * SecuritiesTradeDetails58.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmTradeOriginatorRole
 * SecuritiesTradeDetails63.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmTradeOriginatorRole
 * SecuritiesTradeDetails62.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmTradeOriginatorRole
 * SecuritiesTradeDetails65.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmTradeOriginatorRole
 * SecuritiesTradeDetails66.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmTradeOriginatorRole
 * SecuritiesTradeDetails67.mmTradeOriginatorRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmTradeOriginatorRole
 * SecuritiesTradeDetails70.mmTradeOriginatorRole}</li>
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
 * "TradeOriginatorRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the trading party at the source of the transaction."
 * </li>
 * </ul>
 */
public class TradeOriginatorRole extends TradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected OriginatorRoleCode originatorRole;
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
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator1Choice#mmCode
	 * TradeOriginator1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator1Choice#mmProprietary
	 * TradeOriginator1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator2Choice#mmCode
	 * TradeOriginator2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator2Choice#mmProprietary
	 * TradeOriginator2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator3Choice#mmCode
	 * TradeOriginator3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator3Choice#mmProprietary
	 * TradeOriginator3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator4Choice#mmCode
	 * TradeOriginator4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TradeOriginator4Choice#mmProprietary
	 * TradeOriginator4Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute mmOriginatorRole = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TradeOriginator1Choice.mmCode, TradeOriginator1Choice.mmProprietary, TradeOriginator2Choice.mmCode, TradeOriginator2Choice.mmProprietary, TradeOriginator3Choice.mmCode,
					TradeOriginator3Choice.mmProprietary, TradeOriginator4Choice.mmCode, TradeOriginator4Choice.mmProprietary);
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeOriginatorRole.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginatorRole";
			definition = "Specifies the role of the trading party in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OriginatorRoleCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeOriginatorRole.class.getMethod("getOriginatorRole", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeOriginatorRole";
				definition = "Specifies the trading party at the source of the transaction.";
				derivationElement_lazy = () -> Arrays.asList(SecuritiesTradeDetails25.mmTradeOriginatorRole, SecuritiesTradeDetails26.mmTradeOriginatorRole, SecuritiesTradeDetails27.mmTradeOriginatorRole,
						SecuritiesTradeDetails28.mmTradeOriginatorRole, SecuritiesTradeDetails6.mmTradeOriginatorRole, SecuritiesTradeDetails13.mmTradeOriginatorRole, SecuritiesTradeDetails3.mmTradeOriginatorRole,
						SecuritiesTradeDetails11.mmTradeOriginatorRole, SecuritiesTradeDetails2.mmTradeOriginatorRole, SecuritiesTradeDetails16.mmTradeOriginatorRole, SecuritiesTradeDetails1.mmTradeOriginatorRole,
						SecuritiesTradeDetails15.mmTradeOriginatorRole, SecuritiesTradeDetails31.mmTradeOriginatorRole, SecuritiesTradeDetails33.mmTradeOriginatorRole, SecuritiesTradeDetails38.mmTradeOriginatorRole,
						SecuritiesTradeDetails37.mmTradeOriginatorRole, SecuritiesTradeDetails34.mmTradeOriginatorRole, SecuritiesTradeDetails32.mmTradeOriginatorRole, SecuritiesTradeDetails44.mmTradeOriginatorRole,
						SecuritiesTradeDetails39.mmTradeOriginatorRole, SecuritiesTradeDetails43.mmTradeOriginatorRole, SecuritiesTradeDetails40.mmTradeOriginatorRole, SecuritiesTradeDetails46.mmTradeOriginatorRole,
						SecuritiesTradeDetails47.mmTradeOriginatorRole, SecuritiesTradeDetails51.mmTradeOriginatorRole, SecuritiesTradeDetails53.mmTradeOriginatorRole, SecuritiesTradeDetails55.mmTradeOriginatorRole,
						SecuritiesTradeDetails56.mmTradeOriginatorRole, SecuritiesTradeDetails52.mmTradeOriginatorRole, SecuritiesTradeDetails50.mmTradeOriginatorRole, SecuritiesTradeDetails59.mmTradeOriginatorRole,
						SecuritiesTradeDetails58.mmTradeOriginatorRole, SecuritiesTradeDetails63.mmTradeOriginatorRole, SecuritiesTradeDetails62.mmTradeOriginatorRole, SecuritiesTradeDetails65.mmTradeOriginatorRole,
						SecuritiesTradeDetails66.mmTradeOriginatorRole, SecuritiesTradeDetails67.mmTradeOriginatorRole, SecuritiesTradeDetails70.mmTradeOriginatorRole);
				superType_lazy = () -> TradePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeOriginatorRole.mmOriginatorRole);
				derivationComponent_lazy = () -> Arrays.asList(TradeOriginator1Choice.mmObject(), TradeOriginator2Choice.mmObject(), TradeOriginator3Choice.mmObject(), TradeOriginator4Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradeOriginatorRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public OriginatorRoleCode getOriginatorRole() {
		return originatorRole;
	}

	public void setOriginatorRole(OriginatorRoleCode originatorRole) {
		this.originatorRole = originatorRole;
	}
}