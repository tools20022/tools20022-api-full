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
 * <li>{@linkplain com.tools20022.repository.entity.Pledgee#PledgeeType
 * Pledgee.PledgeeType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Pledgee#SecuritiesBalance
 * Pledgee.SecuritiesBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesBalance#Pledgee
 * SecuritiesBalance.Pledgee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndText1#Identification
 * PledgeeTypeAndText1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat1Choice#TypeAndIdentification
 * PledgeeFormat1Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat1Choice#Identification
 * PledgeeFormat1Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1#Identification
 * PledgeeTypeAndAnyBICIdentifier1.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat2Choice#TypeAndIdentification
 * PledgeeFormat2Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat2Choice#Identification
 * PledgeeFormat2Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndText2#Identification
 * PledgeeTypeAndText2.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice#TypeAndIdentification
 * PledgeeFormat3Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat3Choice#Identification
 * PledgeeFormat3Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat4Choice#TypeAndIdentification
 * PledgeeFormat4Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PledgeeFormat4Choice#Identification
 * PledgeeFormat4Choice.Identification}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndText1#PledgeeType
	 * PledgeeTypeAndText1.PledgeeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1#PledgeeType
	 * PledgeeTypeAndAnyBICIdentifier1.PledgeeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PledgeeTypeAndText2#PledgeeType
	 * PledgeeTypeAndText2.PledgeeType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Pledgee
	 * Pledgee}</li>
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
	public static final MMBusinessAttribute PledgeeType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PledgeeTypeAndText1.PledgeeType, com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1.PledgeeType,
					com.tools20022.repository.msg.PledgeeTypeAndText2.PledgeeType);
			elementContext_lazy = () -> Pledgee.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PledgeeType";
			definition = "Specifies the type of pledgee.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PledgeeTypeCode.mmObject();
		}
	};
	/**
	 * Balance which is held by a pledgee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#Pledgee
	 * SecuritiesBalance.Pledgee}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Pledgee.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Balance which is held by a pledgee.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.Pledgee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Pledgee";
				definition = "Organisation used as the pledgee for the securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesBalance.Pledgee);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PledgeeTypeAndText1.Identification, com.tools20022.repository.choice.PledgeeFormat1Choice.TypeAndIdentification,
						com.tools20022.repository.choice.PledgeeFormat1Choice.Identification, com.tools20022.repository.msg.PledgeeTypeAndAnyBICIdentifier1.Identification,
						com.tools20022.repository.choice.PledgeeFormat2Choice.TypeAndIdentification, com.tools20022.repository.choice.PledgeeFormat2Choice.Identification, com.tools20022.repository.msg.PledgeeTypeAndText2.Identification,
						com.tools20022.repository.choice.PledgeeFormat3Choice.TypeAndIdentification, com.tools20022.repository.choice.PledgeeFormat3Choice.Identification,
						com.tools20022.repository.choice.PledgeeFormat4Choice.TypeAndIdentification, com.tools20022.repository.choice.PledgeeFormat4Choice.Identification);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Pledgee.PledgeeType, com.tools20022.repository.entity.Pledgee.SecuritiesBalance);
				derivationComponent_lazy = () -> Arrays.asList(PledgeeTypeAndText1.mmObject(), PledgeeFormat1Choice.mmObject(), PledgeeTypeAndAnyBICIdentifier1.mmObject(), PledgeeFormat2Choice.mmObject(), PledgeeTypeAndText2.mmObject(),
						PledgeeFormat3Choice.mmObject(), PledgeeFormat4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}