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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InformationPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Entity that assigns the identification.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="IdentificationIssuerRole"
 * src="doc-files/IdentificationIssuerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmCountry
 * IdentificationIssuerRole.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmEntityName
 * IdentificationIssuerRole.mmEntityName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#mmOwnerCode
 * IdentificationIssuerRole.mmOwnerCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification1#mmIssuer
 * GenericIdentification1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification7#mmIssuer
 * GenericIdentification7.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification8#mmIssuer
 * GenericIdentification8.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification9#mmIssuer
 * GenericIdentification9.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification13#mmIssuer
 * GenericIdentification13.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification20#mmIssuer
 * GenericIdentification20.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification25#mmIssuer
 * GenericIdentification25.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification47#mmIssuer
 * GenericIdentification47.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification44#mmIssuer
 * GenericIdentification44.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification41#mmIssuer
 * GenericIdentification41.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification3#mmIssuer
 * GenericIdentification3.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#mmIssuer
 * GenericFinancialIdentification1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#mmIssuer
 * GenericAccountIdentification1.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification3#mmIssuer
 * PersonIdentification3.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#mmIssuer
 * GenericOrganisationIdentification1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#mmIssuer
 * GenericPersonIdentification1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification19#mmIssuer
 * GenericIdentification19.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification24#mmIssuer
 * GenericIdentification24.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification2#mmIssuer
 * GenericOrganisationIdentification2.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification37#mmIssuer
 * GenericIdentification37.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification23#mmIssuer
 * GenericIdentification23.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification18#mmIssuer
 * GenericIdentification18.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification39#mmIssuer
 * GenericIdentification39.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification27#mmIssuer
 * GenericIdentification27.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification22#mmIssuer
 * GenericIdentification22.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification28#mmIssuer
 * GenericIdentification28.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification6#mmIssuer
 * GenericIdentification6.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification5#mmIssuer
 * GenericIdentification5.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification34#mmIssuer
 * GenericIdentification34.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification38#mmIssuer
 * GenericIdentification38.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification29#mmIssuer
 * GenericIdentification29.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification36#mmIssuer
 * GenericIdentification36.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1#mmIssuer
 * ProprietaryBankTransactionCodeStructure1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification32#mmIssuer
 * GenericIdentification32.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification35#mmIssuer
 * GenericIdentification35.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification48#mmIssuer
 * GenericIdentification48.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification31#mmIssuer
 * GenericIdentification31.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification33#mmIssuer
 * GenericIdentification33.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification2#mmIssuer
 * GenericIdentification2.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification11#mmIssuer
 * GenericIdentification11.mmIssuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification2#mmIssuer
 * PersonIdentification2.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification16#mmIssuer
 * GenericIdentification16.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification30#mmIssuer
 * GenericIdentification30.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceCommonIdentification1#mmIssuer
 * BillingServiceCommonIdentification1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification12#mmIssuer
 * GenericIdentification12.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification17#mmIssuer
 * GenericIdentification17.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification40#mmIssuer
 * GenericIdentification40.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification15#mmIssuer
 * GenericIdentification15.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification42#mmIssuer
 * GenericIdentification42.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification51#mmIssuer
 * GenericIdentification51.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification55#mmIssuer
 * GenericIdentification55.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification56#mmIssuer
 * GenericIdentification56.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification65#mmIssuer
 * GenericIdentification65.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification63#mmIssuer
 * GenericIdentification63.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification66#mmIssuer
 * GenericIdentification66.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification62#mmIssuer
 * GenericIdentification62.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification60#mmIssuer
 * GenericIdentification60.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification64#mmIssuer
 * GenericIdentification64.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification67#mmIssuer
 * GenericIdentification67.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification53#mmIssuer
 * GenericIdentification53.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification71#mmIssuer
 * GenericIdentification71.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification73#mmIssuer
 * GenericIdentification73.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification74#mmIssuer
 * GenericIdentification74.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification72#mmIssuer
 * GenericIdentification72.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification70#mmIssuer
 * GenericIdentification70.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification75#mmIssuer
 * GenericIdentification75.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification76#mmIssuer
 * GenericIdentification76.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification77#mmIssuer
 * GenericIdentification77.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#mmIssuer
 * AlternateIdentification4.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification82#mmIssuer
 * GenericIdentification82.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification84#mmIssuer
 * GenericIdentification84.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification86#mmIssuer
 * GenericIdentification86.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification144#mmIssuer
 * GenericIdentification144.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification163#mmIssuer
 * GenericIdentification163.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification79#mmIssuer
 * GenericIdentification79.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification94#mmIssuer
 * GenericIdentification94.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification90#mmIssuer
 * GenericIdentification90.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification93#mmIssuer
 * GenericIdentification93.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification92#mmIssuer
 * GenericIdentification92.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification164#mmIssuer
 * GenericIdentification164.mmIssuer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
 * InformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationSource1Choice
 * IdentificationSource1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationSource3Choice
 * IdentificationSource3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationSource4Choice
 * IdentificationSource4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationSource2Choice
 * IdentificationSource2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.IdentificationSource5Choice
 * IdentificationSource5Choice}</li>
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
 * "IdentificationIssuerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity that assigns the identification."</li>
 * </ul>
 */
public class IdentificationIssuerRole extends InformationPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCode country;
	/**
	 * Country of the proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
	 * IdentificationIssuerRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification3#mmDomesticIdentificationSource
	 * AlternateSecurityIdentification3.mmDomesticIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#mmDomesticIdentificationSource
	 * AlternateSecurityIdentification1.mmDomesticIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource1Choice#mmDomestic
	 * IdentificationSource1Choice.mmDomestic}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource2Choice#mmDomestic
	 * IdentificationSource2Choice.mmDomestic}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmDomesticIdentificationSource
	 * AlternateFinancialInstrumentIdentification1.
	 * mmDomesticIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4#mmDomesticIdentificationSource
	 * AlternateSecurityIdentification4.mmDomesticIdentificationSource}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the proprietary identification scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCountry = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateSecurityIdentification3.mmDomesticIdentificationSource, com.tools20022.repository.msg.AlternateSecurityIdentification1.mmDomesticIdentificationSource,
					com.tools20022.repository.choice.IdentificationSource1Choice.mmDomestic, com.tools20022.repository.choice.IdentificationSource2Choice.mmDomestic,
					com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmDomesticIdentificationSource, com.tools20022.repository.msg.AlternateSecurityIdentification4.mmDomesticIdentificationSource);
			elementContext_lazy = () -> IdentificationIssuerRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Max35Text entityName;
	/**
	 * Entity that issues the proprietary identification.
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
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
	 * IdentificationIssuerRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification3#mmProprietaryIdentificationSource
	 * AlternateSecurityIdentification3.mmProprietaryIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#mmProprietaryIdentificationSource
	 * AlternateSecurityIdentification1.mmProprietaryIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate1#mmIssuer
	 * SecuritiesCertificate1.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate2#mmIssuer
	 * SecuritiesCertificate2.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate3#mmIssuer
	 * SecuritiesCertificate3.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#mmProprietaryIdentificationSource
	 * AlternateFinancialInstrumentIdentification1.
	 * mmProprietaryIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4#mmProprietaryIdentificationSource
	 * AlternateSecurityIdentification4.mmProprietaryIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate4#mmIssuer
	 * SecuritiesCertificate4.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate5#mmIssuer
	 * SecuritiesCertificate5.mmIssuer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntityName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that issues the proprietary identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEntityName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateSecurityIdentification3.mmProprietaryIdentificationSource,
					com.tools20022.repository.msg.AlternateSecurityIdentification1.mmProprietaryIdentificationSource, com.tools20022.repository.msg.SecuritiesCertificate1.mmIssuer,
					com.tools20022.repository.msg.SecuritiesCertificate2.mmIssuer, com.tools20022.repository.msg.SecuritiesCertificate3.mmIssuer,
					com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.mmProprietaryIdentificationSource, com.tools20022.repository.msg.AlternateSecurityIdentification4.mmProprietaryIdentificationSource,
					com.tools20022.repository.msg.SecuritiesCertificate4.mmIssuer, com.tools20022.repository.msg.SecuritiesCertificate5.mmIssuer);
			elementContext_lazy = () -> IdentificationIssuerRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntityName";
			definition = "Entity that issues the proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text ownerCode;
	/**
	 * Code representing the organisation that owns and is responsible of an
	 * enumerated code list, for example ISO.
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
	 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole
	 * IdentificationIssuerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnerCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOwnerCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IdentificationIssuerRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnerCode";
			definition = "Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "IdentificationIssuerRole";
				definition = "Entity that assigns the identification.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification1.mmIssuer, com.tools20022.repository.msg.GenericIdentification7.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification8.mmIssuer, com.tools20022.repository.msg.GenericIdentification9.mmIssuer, com.tools20022.repository.msg.GenericIdentification13.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification20.mmIssuer, com.tools20022.repository.msg.GenericIdentification25.mmIssuer, com.tools20022.repository.msg.GenericIdentification47.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification44.mmIssuer, com.tools20022.repository.msg.GenericIdentification41.mmIssuer, com.tools20022.repository.msg.GenericIdentification3.mmIssuer,
						com.tools20022.repository.msg.GenericFinancialIdentification1.mmIssuer, com.tools20022.repository.msg.GenericAccountIdentification1.mmIssuer, com.tools20022.repository.msg.PersonIdentification3.mmIssuer,
						com.tools20022.repository.msg.GenericOrganisationIdentification1.mmIssuer, com.tools20022.repository.msg.GenericPersonIdentification1.mmIssuer, com.tools20022.repository.msg.GenericIdentification19.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification24.mmIssuer, com.tools20022.repository.msg.GenericOrganisationIdentification2.mmIssuer, com.tools20022.repository.msg.GenericIdentification37.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification23.mmIssuer, com.tools20022.repository.msg.GenericIdentification18.mmIssuer, com.tools20022.repository.msg.GenericIdentification39.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification27.mmIssuer, com.tools20022.repository.msg.GenericIdentification22.mmIssuer, com.tools20022.repository.msg.GenericIdentification28.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification6.mmIssuer, com.tools20022.repository.msg.GenericIdentification5.mmIssuer, com.tools20022.repository.msg.GenericIdentification34.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification38.mmIssuer, com.tools20022.repository.msg.GenericIdentification29.mmIssuer, com.tools20022.repository.msg.GenericIdentification36.mmIssuer,
						com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1.mmIssuer, com.tools20022.repository.msg.GenericIdentification32.mmIssuer, com.tools20022.repository.msg.GenericIdentification35.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification48.mmIssuer, com.tools20022.repository.msg.GenericIdentification31.mmIssuer, com.tools20022.repository.msg.GenericIdentification33.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification2.mmIssuer, com.tools20022.repository.msg.GenericIdentification11.mmIssuer, com.tools20022.repository.msg.PersonIdentification2.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification16.mmIssuer, com.tools20022.repository.msg.GenericIdentification30.mmIssuer, com.tools20022.repository.msg.BillingServiceCommonIdentification1.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification12.mmIssuer, com.tools20022.repository.msg.GenericIdentification17.mmIssuer, com.tools20022.repository.msg.GenericIdentification40.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification15.mmIssuer, com.tools20022.repository.msg.GenericIdentification42.mmIssuer, com.tools20022.repository.msg.GenericIdentification51.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification55.mmIssuer, com.tools20022.repository.msg.GenericIdentification56.mmIssuer, com.tools20022.repository.msg.GenericIdentification65.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification63.mmIssuer, com.tools20022.repository.msg.GenericIdentification66.mmIssuer, com.tools20022.repository.msg.GenericIdentification62.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification60.mmIssuer, com.tools20022.repository.msg.GenericIdentification64.mmIssuer, com.tools20022.repository.msg.GenericIdentification67.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification53.mmIssuer, com.tools20022.repository.msg.GenericIdentification71.mmIssuer, com.tools20022.repository.msg.GenericIdentification73.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification74.mmIssuer, com.tools20022.repository.msg.GenericIdentification72.mmIssuer, com.tools20022.repository.msg.GenericIdentification70.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification75.mmIssuer, com.tools20022.repository.msg.GenericIdentification76.mmIssuer, com.tools20022.repository.msg.GenericIdentification77.mmIssuer,
						com.tools20022.repository.msg.AlternateIdentification4.mmIssuer, com.tools20022.repository.msg.GenericIdentification82.mmIssuer, com.tools20022.repository.msg.GenericIdentification84.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification86.mmIssuer, com.tools20022.repository.msg.GenericIdentification144.mmIssuer, com.tools20022.repository.msg.GenericIdentification163.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification79.mmIssuer, com.tools20022.repository.msg.GenericIdentification94.mmIssuer, com.tools20022.repository.msg.GenericIdentification90.mmIssuer,
						com.tools20022.repository.msg.GenericIdentification93.mmIssuer, com.tools20022.repository.msg.GenericIdentification92.mmIssuer, com.tools20022.repository.msg.GenericIdentification164.mmIssuer);
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IdentificationIssuerRole.mmCountry, com.tools20022.repository.entity.IdentificationIssuerRole.mmEntityName,
						com.tools20022.repository.entity.IdentificationIssuerRole.mmOwnerCode);
				derivationComponent_lazy = () -> Arrays.asList(IdentificationSource1Choice.mmObject(), IdentificationSource3Choice.mmObject(), IdentificationSource4Choice.mmObject(), IdentificationSource2Choice.mmObject(),
						IdentificationSource5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getCountry() {
		return country;
	}

	public void setCountry(CountryCode country) {
		this.country = country;
	}

	public Max35Text getEntityName() {
		return entityName;
	}

	public void setEntityName(Max35Text entityName) {
		this.entityName = entityName;
	}

	public Max35Text getOwnerCode() {
		return ownerCode;
	}

	public void setOwnerCode(Max35Text ownerCode) {
		this.ownerCode = ownerCode;
	}
}