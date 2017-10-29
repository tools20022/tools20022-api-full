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
 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#Country
 * IdentificationIssuerRole.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#EntityName
 * IdentificationIssuerRole.EntityName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.IdentificationIssuerRole#OwnerCode
 * IdentificationIssuerRole.OwnerCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification1#Issuer
 * GenericIdentification1.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification7#Issuer
 * GenericIdentification7.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification8#Issuer
 * GenericIdentification8.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification9#Issuer
 * GenericIdentification9.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification13#Issuer
 * GenericIdentification13.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification20#Issuer
 * GenericIdentification20.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification25#Issuer
 * GenericIdentification25.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification47#Issuer
 * GenericIdentification47.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification44#Issuer
 * GenericIdentification44.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification41#Issuer
 * GenericIdentification41.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification3#Issuer
 * GenericIdentification3.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericFinancialIdentification1#Issuer
 * GenericFinancialIdentification1.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericAccountIdentification1#Issuer
 * GenericAccountIdentification1.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification3#Issuer
 * PersonIdentification3.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification1#Issuer
 * GenericOrganisationIdentification1.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericPersonIdentification1#Issuer
 * GenericPersonIdentification1.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification19#Issuer
 * GenericIdentification19.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification24#Issuer
 * GenericIdentification24.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericOrganisationIdentification2#Issuer
 * GenericOrganisationIdentification2.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification37#Issuer
 * GenericIdentification37.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification23#Issuer
 * GenericIdentification23.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification18#Issuer
 * GenericIdentification18.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification39#Issuer
 * GenericIdentification39.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification27#Issuer
 * GenericIdentification27.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification22#Issuer
 * GenericIdentification22.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification28#Issuer
 * GenericIdentification28.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification6#Issuer
 * GenericIdentification6.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification5#Issuer
 * GenericIdentification5.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification34#Issuer
 * GenericIdentification34.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification38#Issuer
 * GenericIdentification38.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification29#Issuer
 * GenericIdentification29.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification36#Issuer
 * GenericIdentification36.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1#Issuer
 * ProprietaryBankTransactionCodeStructure1.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification32#Issuer
 * GenericIdentification32.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification35#Issuer
 * GenericIdentification35.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification48#Issuer
 * GenericIdentification48.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification31#Issuer
 * GenericIdentification31.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification33#Issuer
 * GenericIdentification33.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification2#Issuer
 * GenericIdentification2.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification11#Issuer
 * GenericIdentification11.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PersonIdentification2#Issuer
 * PersonIdentification2.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification16#Issuer
 * GenericIdentification16.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification30#Issuer
 * GenericIdentification30.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingServiceCommonIdentification1#Issuer
 * BillingServiceCommonIdentification1.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification12#Issuer
 * GenericIdentification12.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification17#Issuer
 * GenericIdentification17.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification40#Issuer
 * GenericIdentification40.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification15#Issuer
 * GenericIdentification15.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification42#Issuer
 * GenericIdentification42.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification51#Issuer
 * GenericIdentification51.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification55#Issuer
 * GenericIdentification55.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification56#Issuer
 * GenericIdentification56.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification65#Issuer
 * GenericIdentification65.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification63#Issuer
 * GenericIdentification63.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification66#Issuer
 * GenericIdentification66.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification62#Issuer
 * GenericIdentification62.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification60#Issuer
 * GenericIdentification60.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification64#Issuer
 * GenericIdentification64.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification67#Issuer
 * GenericIdentification67.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification53#Issuer
 * GenericIdentification53.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification71#Issuer
 * GenericIdentification71.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification73#Issuer
 * GenericIdentification73.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification74#Issuer
 * GenericIdentification74.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification72#Issuer
 * GenericIdentification72.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification70#Issuer
 * GenericIdentification70.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification75#Issuer
 * GenericIdentification75.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification76#Issuer
 * GenericIdentification76.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification77#Issuer
 * GenericIdentification77.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlternateIdentification4#Issuer
 * AlternateIdentification4.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification82#Issuer
 * GenericIdentification82.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification84#Issuer
 * GenericIdentification84.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification86#Issuer
 * GenericIdentification86.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification144#Issuer
 * GenericIdentification144.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification163#Issuer
 * GenericIdentification163.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification79#Issuer
 * GenericIdentification79.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification94#Issuer
 * GenericIdentification94.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification90#Issuer
 * GenericIdentification90.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification93#Issuer
 * GenericIdentification93.Issuer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GenericIdentification92#Issuer
 * GenericIdentification92.Issuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification164#Issuer
 * GenericIdentification164.Issuer}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Country of the proprietary identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification3#DomesticIdentificationSource
	 * AlternateSecurityIdentification3.DomesticIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#DomesticIdentificationSource
	 * AlternateSecurityIdentification1.DomesticIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource1Choice#Domestic
	 * IdentificationSource1Choice.Domestic}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationSource2Choice#Domestic
	 * IdentificationSource2Choice.Domestic}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#DomesticIdentificationSource
	 * AlternateFinancialInstrumentIdentification1.DomesticIdentificationSource}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4#DomesticIdentificationSource
	 * AlternateSecurityIdentification4.DomesticIdentificationSource}</li>
	 * </ul>
	 * </li>
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
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of the proprietary identification scheme."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Country = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateSecurityIdentification3.DomesticIdentificationSource, com.tools20022.repository.msg.AlternateSecurityIdentification1.DomesticIdentificationSource,
					com.tools20022.repository.choice.IdentificationSource1Choice.Domestic, com.tools20022.repository.choice.IdentificationSource2Choice.Domestic,
					com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.DomesticIdentificationSource, com.tools20022.repository.msg.AlternateSecurityIdentification4.DomesticIdentificationSource);
			elementContext_lazy = () -> IdentificationIssuerRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the proprietary identification scheme.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	/**
	 * Entity that issues the proprietary identification.
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
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification3#ProprietaryIdentificationSource
	 * AlternateSecurityIdentification3.ProprietaryIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1#ProprietaryIdentificationSource
	 * AlternateSecurityIdentification1.ProprietaryIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate1#Issuer
	 * SecuritiesCertificate1.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate2#Issuer
	 * SecuritiesCertificate2.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate3#Issuer
	 * SecuritiesCertificate3.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1#ProprietaryIdentificationSource
	 * AlternateFinancialInstrumentIdentification1.
	 * ProprietaryIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification4#ProprietaryIdentificationSource
	 * AlternateSecurityIdentification4.ProprietaryIdentificationSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate4#Issuer
	 * SecuritiesCertificate4.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesCertificate5#Issuer
	 * SecuritiesCertificate5.Issuer}</li>
	 * </ul>
	 * </li>
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
	 * name} = "EntityName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity that issues the proprietary identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EntityName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlternateSecurityIdentification3.ProprietaryIdentificationSource,
					com.tools20022.repository.msg.AlternateSecurityIdentification1.ProprietaryIdentificationSource, com.tools20022.repository.msg.SecuritiesCertificate1.Issuer, com.tools20022.repository.msg.SecuritiesCertificate2.Issuer,
					com.tools20022.repository.msg.SecuritiesCertificate3.Issuer, com.tools20022.repository.msg.AlternateFinancialInstrumentIdentification1.ProprietaryIdentificationSource,
					com.tools20022.repository.msg.AlternateSecurityIdentification4.ProprietaryIdentificationSource, com.tools20022.repository.msg.SecuritiesCertificate4.Issuer, com.tools20022.repository.msg.SecuritiesCertificate5.Issuer);
			elementContext_lazy = () -> IdentificationIssuerRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntityName";
			definition = "Entity that issues the proprietary identification.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	public static final MMBusinessAttribute OwnerCode = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> IdentificationIssuerRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnerCode";
			definition = "Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO.";
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
				name = "IdentificationIssuerRole";
				definition = "Entity that assigns the identification.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GenericIdentification1.Issuer, com.tools20022.repository.msg.GenericIdentification7.Issuer,
						com.tools20022.repository.msg.GenericIdentification8.Issuer, com.tools20022.repository.msg.GenericIdentification9.Issuer, com.tools20022.repository.msg.GenericIdentification13.Issuer,
						com.tools20022.repository.msg.GenericIdentification20.Issuer, com.tools20022.repository.msg.GenericIdentification25.Issuer, com.tools20022.repository.msg.GenericIdentification47.Issuer,
						com.tools20022.repository.msg.GenericIdentification44.Issuer, com.tools20022.repository.msg.GenericIdentification41.Issuer, com.tools20022.repository.msg.GenericIdentification3.Issuer,
						com.tools20022.repository.msg.GenericFinancialIdentification1.Issuer, com.tools20022.repository.msg.GenericAccountIdentification1.Issuer, com.tools20022.repository.msg.PersonIdentification3.Issuer,
						com.tools20022.repository.msg.GenericOrganisationIdentification1.Issuer, com.tools20022.repository.msg.GenericPersonIdentification1.Issuer, com.tools20022.repository.msg.GenericIdentification19.Issuer,
						com.tools20022.repository.msg.GenericIdentification24.Issuer, com.tools20022.repository.msg.GenericOrganisationIdentification2.Issuer, com.tools20022.repository.msg.GenericIdentification37.Issuer,
						com.tools20022.repository.msg.GenericIdentification23.Issuer, com.tools20022.repository.msg.GenericIdentification18.Issuer, com.tools20022.repository.msg.GenericIdentification39.Issuer,
						com.tools20022.repository.msg.GenericIdentification27.Issuer, com.tools20022.repository.msg.GenericIdentification22.Issuer, com.tools20022.repository.msg.GenericIdentification28.Issuer,
						com.tools20022.repository.msg.GenericIdentification6.Issuer, com.tools20022.repository.msg.GenericIdentification5.Issuer, com.tools20022.repository.msg.GenericIdentification34.Issuer,
						com.tools20022.repository.msg.GenericIdentification38.Issuer, com.tools20022.repository.msg.GenericIdentification29.Issuer, com.tools20022.repository.msg.GenericIdentification36.Issuer,
						com.tools20022.repository.msg.ProprietaryBankTransactionCodeStructure1.Issuer, com.tools20022.repository.msg.GenericIdentification32.Issuer, com.tools20022.repository.msg.GenericIdentification35.Issuer,
						com.tools20022.repository.msg.GenericIdentification48.Issuer, com.tools20022.repository.msg.GenericIdentification31.Issuer, com.tools20022.repository.msg.GenericIdentification33.Issuer,
						com.tools20022.repository.msg.GenericIdentification2.Issuer, com.tools20022.repository.msg.GenericIdentification11.Issuer, com.tools20022.repository.msg.PersonIdentification2.Issuer,
						com.tools20022.repository.msg.GenericIdentification16.Issuer, com.tools20022.repository.msg.GenericIdentification30.Issuer, com.tools20022.repository.msg.BillingServiceCommonIdentification1.Issuer,
						com.tools20022.repository.msg.GenericIdentification12.Issuer, com.tools20022.repository.msg.GenericIdentification17.Issuer, com.tools20022.repository.msg.GenericIdentification40.Issuer,
						com.tools20022.repository.msg.GenericIdentification15.Issuer, com.tools20022.repository.msg.GenericIdentification42.Issuer, com.tools20022.repository.msg.GenericIdentification51.Issuer,
						com.tools20022.repository.msg.GenericIdentification55.Issuer, com.tools20022.repository.msg.GenericIdentification56.Issuer, com.tools20022.repository.msg.GenericIdentification65.Issuer,
						com.tools20022.repository.msg.GenericIdentification63.Issuer, com.tools20022.repository.msg.GenericIdentification66.Issuer, com.tools20022.repository.msg.GenericIdentification62.Issuer,
						com.tools20022.repository.msg.GenericIdentification60.Issuer, com.tools20022.repository.msg.GenericIdentification64.Issuer, com.tools20022.repository.msg.GenericIdentification67.Issuer,
						com.tools20022.repository.msg.GenericIdentification53.Issuer, com.tools20022.repository.msg.GenericIdentification71.Issuer, com.tools20022.repository.msg.GenericIdentification73.Issuer,
						com.tools20022.repository.msg.GenericIdentification74.Issuer, com.tools20022.repository.msg.GenericIdentification72.Issuer, com.tools20022.repository.msg.GenericIdentification70.Issuer,
						com.tools20022.repository.msg.GenericIdentification75.Issuer, com.tools20022.repository.msg.GenericIdentification76.Issuer, com.tools20022.repository.msg.GenericIdentification77.Issuer,
						com.tools20022.repository.msg.AlternateIdentification4.Issuer, com.tools20022.repository.msg.GenericIdentification82.Issuer, com.tools20022.repository.msg.GenericIdentification84.Issuer,
						com.tools20022.repository.msg.GenericIdentification86.Issuer, com.tools20022.repository.msg.GenericIdentification144.Issuer, com.tools20022.repository.msg.GenericIdentification163.Issuer,
						com.tools20022.repository.msg.GenericIdentification79.Issuer, com.tools20022.repository.msg.GenericIdentification94.Issuer, com.tools20022.repository.msg.GenericIdentification90.Issuer,
						com.tools20022.repository.msg.GenericIdentification93.Issuer, com.tools20022.repository.msg.GenericIdentification92.Issuer, com.tools20022.repository.msg.GenericIdentification164.Issuer);
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IdentificationIssuerRole.Country, com.tools20022.repository.entity.IdentificationIssuerRole.EntityName,
						com.tools20022.repository.entity.IdentificationIssuerRole.OwnerCode);
				derivationComponent_lazy = () -> Arrays.asList(IdentificationSource1Choice.mmObject(), IdentificationSource3Choice.mmObject(), IdentificationSource4Choice.mmObject(), IdentificationSource2Choice.mmObject(),
						IdentificationSource5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}