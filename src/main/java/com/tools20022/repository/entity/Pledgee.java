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
import com.tools20022.repository.choice.PledgeeFormat1Choice;
import com.tools20022.repository.choice.PledgeeFormat2Choice;
import com.tools20022.repository.choice.PledgeeFormat3Choice;
import com.tools20022.repository.choice.PledgeeFormat4Choice;
import com.tools20022.repository.codeset.PledgeeTypeCode;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1;
import com.tools20022.repository.msg.PledgeeTypeAndText1;
import com.tools20022.repository.msg.PledgeeTypeAndText2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organisation used as the pledgee for the securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Pledgee" src="doc-files/Pledgee.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Pledgee#mmPledgeeType
 * Pledgee.mmPledgeeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Pledgee#mmSecuritiesBalance
 * Pledgee.mmSecuritiesBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmPledgee
 * SecuritiesBalance.mmPledgee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndText1#mmIdentification
 * PledgeeTypeAndText1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat1Choice#mmTypeAndIdentification
 * PledgeeFormat1Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat1Choice#mmIdentification
 * PledgeeFormat1Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1#mmIdentification
 * PledgeeTypeAndAnyBICIdentifier1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat2Choice#mmTypeAndIdentification
 * PledgeeFormat2Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat2Choice#mmIdentification
 * PledgeeFormat2Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndText2#mmIdentification
 * PledgeeTypeAndText2.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice#mmTypeAndIdentification
 * PledgeeFormat3Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice#mmIdentification
 * PledgeeFormat3Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat4Choice#mmTypeAndIdentification
 * PledgeeFormat4Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat4Choice#mmIdentification
 * PledgeeFormat4Choice.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PledgeeTypeAndText1
 * PledgeeTypeAndText1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PledgeeFormat1Choice
 * PledgeeFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1
 * PledgeeTypeAndAnyBICIdentifier1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PledgeeFormat2Choice
 * PledgeeFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PledgeeTypeAndText2
 * PledgeeTypeAndText2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice
 * PledgeeFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PledgeeFormat4Choice
 * PledgeeFormat4Choice}</li>
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
 * "Pledgee"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Organisation used as the pledgee for the securities."</li>
 * </ul>
 */
public class Pledgee extends SecuritiesPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PledgeeTypeCode pledgeeType;
	/**
	 * Specifies the type of pledgee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PledgeeTypeCode
	 * PledgeeTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Pledgee
	 * Pledgee}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndText1#mmPledgeeType
	 * PledgeeTypeAndText1.mmPledgeeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1#mmPledgeeType
	 * PledgeeTypeAndAnyBICIdentifier1.mmPledgeeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndText2#mmPledgeeType
	 * PledgeeTypeAndText2.mmPledgeeType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of pledgee."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPledgeeType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PledgeeTypeAndText1.mmPledgeeType, com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1.mmPledgeeType,
					com.tools20022.repository.msg.PledgeeTypeAndText2.mmPledgeeType);
			elementContext_lazy = () -> Pledgee.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PledgeeType";
			definition = "Specifies the type of pledgee.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PledgeeTypeCode.mmObject();
		}
	};
	protected SecuritiesBalance securitiesBalance;
	/**
	 * Balance which is held by a pledgee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmPledgee
	 * SecuritiesBalance.mmPledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Pledgee
	 * Pledgee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance which is held by a pledgee."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Pledgee.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Balance which is held by a pledgee.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmPledgee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Pledgee";
				definition = "Organisation used as the pledgee for the securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.mmPledgee);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PledgeeTypeAndText1.mmIdentification, com.tools20022.repository.choice.PledgeeFormat1Choice.mmTypeAndIdentification,
						com.tools20022.repository.choice.PledgeeFormat1Choice.mmIdentification, com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1.mmIdentification,
						com.tools20022.repository.choice.PledgeeFormat2Choice.mmTypeAndIdentification, com.tools20022.repository.choice.PledgeeFormat2Choice.mmIdentification,
						com.tools20022.repository.msg.PledgeeTypeAndText2.mmIdentification, com.tools20022.repository.choice.PledgeeFormat3Choice.mmTypeAndIdentification,
						com.tools20022.repository.choice.PledgeeFormat3Choice.mmIdentification, com.tools20022.repository.choice.PledgeeFormat4Choice.mmTypeAndIdentification,
						com.tools20022.repository.choice.PledgeeFormat4Choice.mmIdentification);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Pledgee.mmPledgeeType, com.tools20022.repository.entity.Pledgee.mmSecuritiesBalance);
				derivationComponent_lazy = () -> Arrays.asList(PledgeeTypeAndText1.mmObject(), PledgeeFormat1Choice.mmObject(), PledgeeTypeAndAnyBICIdentifier1.mmObject(), PledgeeFormat2Choice.mmObject(), PledgeeTypeAndText2.mmObject(),
						PledgeeFormat3Choice.mmObject(), PledgeeFormat4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PledgeeTypeCode getPledgeeType() {
		return pledgeeType;
	}

	public void setPledgeeType(PledgeeTypeCode pledgeeType) {
		this.pledgeeType = pledgeeType;
	}

	public SecuritiesBalance getSecuritiesBalance() {
		return securitiesBalance;
	}

	public void setSecuritiesBalance(com.tools20022.repository.entity.SecuritiesBalance securitiesBalance) {
		this.securitiesBalance = securitiesBalance;
	}
}