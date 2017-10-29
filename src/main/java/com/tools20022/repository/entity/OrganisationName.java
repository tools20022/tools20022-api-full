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
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.msg.FullLegalNameModification1;
import com.tools20022.repository.msg.TradingNameModification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Name by which an organisation is known and which is usually used to identify
 * that organisation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="OrganisationName" src="doc-files/OrganisationName.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#Organisation
 * OrganisationName.Organisation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationName#LegalName
 * OrganisationName.LegalName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#TradingName
 * OrganisationName.TradingName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.OrganisationName#ShortName
 * OrganisationName.ShortName}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#OrganisationName
 * OrganisationIdentification.OrganisationName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PartyName
 * PartyName}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FullLegalNameModification1
 * FullLegalNameModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradingNameModification1
 * TradingNameModification1}</li>
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
 * "OrganisationName"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Name by which an organisation is known and which is usually used to identify that organisation."
 * </li>
 * </ul>
 */
public class OrganisationName extends PartyName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Organisation identification which contains a name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#OrganisationName
	 * OrganisationIdentification.OrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organisation identification which contains a name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Organisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> OrganisationName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation identification which contains a name.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> OrganisationIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.OrganisationName;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Official name under which an organisation is registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation6#FullLegalName
	 * Organisation6.FullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#FullLegalName
	 * Organisation12.FullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation14#FullLegalName
	 * Organisation14.FullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FullLegalNameModification1#FullLegalName
	 * FullLegalNameModification1.FullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#FullLegalName
	 * OrganisationModification1.FullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation7#FullLegalName
	 * Organisation7.FullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#LegalName
	 * PartyIdentification58.LegalName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Official name under which an organisation is registered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LegalName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation6.FullLegalName, com.tools20022.repository.msg.Organisation12.FullLegalName, com.tools20022.repository.msg.Organisation14.FullLegalName,
					com.tools20022.repository.msg.FullLegalNameModification1.FullLegalName, com.tools20022.repository.msg.OrganisationModification1.FullLegalName, com.tools20022.repository.msg.Organisation7.FullLegalName,
					com.tools20022.repository.msg.PartyIdentification58.LegalName);
			elementContext_lazy = () -> OrganisationName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalName";
			definition = "Official name under which an organisation is registered.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Name used by a business for commercial purposes, although its registered
	 * legal name, used for contracts and other formal situations, may be
	 * another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation6#TradingName
	 * Organisation6.TradingName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation12#TradingName
	 * Organisation12.TradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingNameModification1#TradingName
	 * TradingNameModification1.TradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#TradingName
	 * OrganisationModification1.TradingName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation7#TradingName
	 * Organisation7.TradingName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation6.TradingName, com.tools20022.repository.msg.Organisation12.TradingName, com.tools20022.repository.msg.TradingNameModification1.TradingName,
					com.tools20022.repository.msg.OrganisationModification1.TradingName, com.tools20022.repository.msg.Organisation7.TradingName);
			elementContext_lazy = () -> OrganisationName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingName";
			definition = "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the short name of the organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32#ShortName
	 * GenericIdentification32.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification35#ShortName
	 * GenericIdentification35.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification31#ShortName
	 * GenericIdentification31.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification33#ShortName
	 * GenericIdentification33.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53#ShortName
	 * GenericIdentification53.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification71#ShortName
	 * GenericIdentification71.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification73#ShortName
	 * GenericIdentification73.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification74#ShortName
	 * GenericIdentification74.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72#ShortName
	 * GenericIdentification72.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification70#ShortName
	 * GenericIdentification70.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification75#ShortName
	 * GenericIdentification75.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification76#ShortName
	 * GenericIdentification76.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification77#ShortName
	 * GenericIdentification77.ShortName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation18#CommonName
	 * Organisation18.CommonName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation19#CommonName
	 * Organisation19.CommonName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation22#ShortName
	 * Organisation22.ShortName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation23#ShortName
	 * Organisation23.ShortName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#ShortName
	 * Organisation24.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification94#ShortName
	 * GenericIdentification94.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification90#ShortName
	 * GenericIdentification90.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification93#ShortName
	 * GenericIdentification93.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification92#ShortName
	 * GenericIdentification92.ShortName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#ShortName
	 * Organisation30.ShortName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation29#ShortName
	 * Organisation29.ShortName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the short name of the organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ShortName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification32.ShortName, com.tools20022.repository.msg.GenericIdentification35.ShortName,
					com.tools20022.repository.msg.GenericIdentification31.ShortName, com.tools20022.repository.msg.GenericIdentification33.ShortName, com.tools20022.repository.msg.GenericIdentification53.ShortName,
					com.tools20022.repository.msg.GenericIdentification71.ShortName, com.tools20022.repository.msg.GenericIdentification73.ShortName, com.tools20022.repository.msg.GenericIdentification74.ShortName,
					com.tools20022.repository.msg.GenericIdentification72.ShortName, com.tools20022.repository.msg.GenericIdentification70.ShortName, com.tools20022.repository.msg.GenericIdentification75.ShortName,
					com.tools20022.repository.msg.GenericIdentification76.ShortName, com.tools20022.repository.msg.GenericIdentification77.ShortName, com.tools20022.repository.msg.Organisation18.CommonName,
					com.tools20022.repository.msg.Organisation19.CommonName, com.tools20022.repository.msg.Organisation22.ShortName, com.tools20022.repository.msg.Organisation23.ShortName,
					com.tools20022.repository.msg.Organisation24.ShortName, com.tools20022.repository.msg.GenericIdentification94.ShortName, com.tools20022.repository.msg.GenericIdentification90.ShortName,
					com.tools20022.repository.msg.GenericIdentification93.ShortName, com.tools20022.repository.msg.GenericIdentification92.ShortName, com.tools20022.repository.msg.Organisation30.ShortName,
					com.tools20022.repository.msg.Organisation29.ShortName);
			elementContext_lazy = () -> OrganisationName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortName";
			definition = "Specifies the short name of the organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrganisationName";
				definition = "Name by which an organisation is known and which is usually used to identify that organisation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationIdentification.OrganisationName);
				superType_lazy = () -> PartyName.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationName.Organisation, com.tools20022.repository.entity.OrganisationName.LegalName, com.tools20022.repository.entity.OrganisationName.TradingName,
						com.tools20022.repository.entity.OrganisationName.ShortName);
				derivationComponent_lazy = () -> Arrays.asList(FullLegalNameModification1.mmObject(), TradingNameModification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}