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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisationName
 * OrganisationIdentification.mmOrganisationName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.PartyName
 * PartyName}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmOrganisation
 * OrganisationName.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmLegalName
 * OrganisationName.mmLegalName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmTradingName
 * OrganisationName.mmTradingName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmShortName
 * OrganisationName.mmShortName}</li>
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
 * "OrganisationName"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Name by which an organisation is known and which is usually used to identify that organisation."
 * </li>
 * </ul>
 */
public class OrganisationName extends PartyName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected OrganisationIdentification organisation;
	/**
	 * Organisation identification which contains a name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmOrganisationName
	 * OrganisationIdentification.mmOrganisationName}</li>
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
	public static final MMBusinessAssociationEnd mmOrganisation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> OrganisationName.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Organisation";
			definition = "Organisation identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmOrganisationName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.OrganisationIdentification.mmObject();
		}
	};
	protected Max35Text legalName;
	/**
	 * Official name under which an organisation is registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation6#mmFullLegalName
	 * Organisation6.mmFullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmFullLegalName
	 * Organisation12.mmFullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation14#mmFullLegalName
	 * Organisation14.mmFullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FullLegalNameModification1#mmFullLegalName
	 * FullLegalNameModification1.mmFullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmFullLegalName
	 * OrganisationModification1.mmFullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation7#mmFullLegalName
	 * Organisation7.mmFullLegalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification58#mmLegalName
	 * PartyIdentification58.mmLegalName}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmLegalName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation6.mmFullLegalName, Organisation12.mmFullLegalName, Organisation14.mmFullLegalName, FullLegalNameModification1.mmFullLegalName, OrganisationModification1.mmFullLegalName,
					Organisation7.mmFullLegalName, PartyIdentification58.mmLegalName);
			elementContext_lazy = () -> OrganisationName.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalName";
			definition = "Official name under which an organisation is registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max350Text tradingName;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation6#mmTradingName
	 * Organisation6.mmTradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation12#mmTradingName
	 * Organisation12.mmTradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradingNameModification1#mmTradingName
	 * TradingNameModification1.mmTradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrganisationModification1#mmTradingName
	 * OrganisationModification1.mmTradingName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation7#mmTradingName
	 * Organisation7.mmTradingName}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTradingName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Organisation6.mmTradingName, Organisation12.mmTradingName, TradingNameModification1.mmTradingName, OrganisationModification1.mmTradingName, Organisation7.mmTradingName);
			elementContext_lazy = () -> OrganisationName.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingName";
			definition = "Name used by a business for commercial purposes, although its registered legal name, used for contracts and other formal situations, may be another.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text shortName;
	/**
	 * Specifies the short name of the organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationName
	 * OrganisationName}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32#mmShortName
	 * GenericIdentification32.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification35#mmShortName
	 * GenericIdentification35.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification31#mmShortName
	 * GenericIdentification31.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification33#mmShortName
	 * GenericIdentification33.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53#mmShortName
	 * GenericIdentification53.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification71#mmShortName
	 * GenericIdentification71.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification73#mmShortName
	 * GenericIdentification73.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification74#mmShortName
	 * GenericIdentification74.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification72#mmShortName
	 * GenericIdentification72.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification70#mmShortName
	 * GenericIdentification70.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification75#mmShortName
	 * GenericIdentification75.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification76#mmShortName
	 * GenericIdentification76.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification77#mmShortName
	 * GenericIdentification77.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation18#mmCommonName
	 * Organisation18.mmCommonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation19#mmCommonName
	 * Organisation19.mmCommonName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation22#mmShortName
	 * Organisation22.mmShortName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation23#mmShortName
	 * Organisation23.mmShortName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#mmShortName
	 * Organisation24.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification94#mmShortName
	 * GenericIdentification94.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification90#mmShortName
	 * GenericIdentification90.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification93#mmShortName
	 * GenericIdentification93.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification92#mmShortName
	 * GenericIdentification92.mmShortName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#mmShortName
	 * Organisation30.mmShortName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation29#mmShortName
	 * Organisation29.mmShortName}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmShortName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(GenericIdentification32.mmShortName, GenericIdentification35.mmShortName, GenericIdentification31.mmShortName, GenericIdentification33.mmShortName, GenericIdentification53.mmShortName,
					GenericIdentification71.mmShortName, GenericIdentification73.mmShortName, GenericIdentification74.mmShortName, GenericIdentification72.mmShortName, GenericIdentification70.mmShortName,
					GenericIdentification75.mmShortName, GenericIdentification76.mmShortName, GenericIdentification77.mmShortName, Organisation18.mmCommonName, Organisation19.mmCommonName, Organisation22.mmShortName,
					Organisation23.mmShortName, Organisation24.mmShortName, GenericIdentification94.mmShortName, GenericIdentification90.mmShortName, GenericIdentification93.mmShortName, GenericIdentification92.mmShortName,
					Organisation30.mmShortName, Organisation29.mmShortName);
			elementContext_lazy = () -> OrganisationName.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShortName";
			definition = "Specifies the short name of the organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrganisationName";
				definition = "Name by which an organisation is known and which is usually used to identify that organisation.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.OrganisationIdentification.mmOrganisationName);
				superType_lazy = () -> PartyName.mmObject();
				element_lazy = () -> Arrays.asList(OrganisationName.mmOrganisation, OrganisationName.mmLegalName, OrganisationName.mmTradingName, OrganisationName.mmShortName);
				derivationComponent_lazy = () -> Arrays.asList(FullLegalNameModification1.mmObject(), TradingNameModification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public OrganisationIdentification getOrganisation() {
		return organisation;
	}

	public void setOrganisation(com.tools20022.repository.entity.OrganisationIdentification organisation) {
		this.organisation = organisation;
	}

	public Max35Text getLegalName() {
		return legalName;
	}

	public void setLegalName(Max35Text legalName) {
		this.legalName = legalName;
	}

	public Max350Text getTradingName() {
		return tradingName;
	}

	public void setTradingName(Max350Text tradingName) {
		this.tradingName = tradingName;
	}

	public Max35Text getShortName() {
		return shortName;
	}

	public void setShortName(Max35Text shortName) {
		this.shortName = shortName;
	}
}