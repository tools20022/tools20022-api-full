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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InformationPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
 * InformationPartyRole}</li>
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification165#mmIssuer
 * GenericIdentification165.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification166#mmIssuer
 * GenericIdentification166.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification169#mmIssuer
 * GenericIdentification169.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification168#mmIssuer
 * GenericIdentification168.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification172#mmIssuer
 * GenericIdentification172.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification167#mmIssuer
 * GenericIdentification167.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GenericIdentification170#mmIssuer
 * GenericIdentification170.mmIssuer}</li>
 * </ul>
 * </li>
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
	protected CountryCode country;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<IdentificationIssuerRole, CountryCode> mmCountry = new MMBusinessAttribute<IdentificationIssuerRole, CountryCode>() {
		{
			derivation_lazy = () -> Arrays.asList(AlternateSecurityIdentification3.mmDomesticIdentificationSource, AlternateSecurityIdentification1.mmDomesticIdentificationSource, IdentificationSource1Choice.mmDomestic,
					IdentificationSource2Choice.mmDomestic, AlternateFinancialInstrumentIdentification1.mmDomesticIdentificationSource, AlternateSecurityIdentification4.mmDomesticIdentificationSource);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IdentificationIssuerRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country of the proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public CountryCode getValue(IdentificationIssuerRole obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(IdentificationIssuerRole obj, CountryCode value) {
			obj.setCountry(value);
		}
	};
	protected Max35Text entityName;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<IdentificationIssuerRole, Max35Text> mmEntityName = new MMBusinessAttribute<IdentificationIssuerRole, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(AlternateSecurityIdentification3.mmProprietaryIdentificationSource, AlternateSecurityIdentification1.mmProprietaryIdentificationSource, SecuritiesCertificate1.mmIssuer,
					SecuritiesCertificate2.mmIssuer, SecuritiesCertificate3.mmIssuer, AlternateFinancialInstrumentIdentification1.mmProprietaryIdentificationSource, AlternateSecurityIdentification4.mmProprietaryIdentificationSource,
					SecuritiesCertificate4.mmIssuer, SecuritiesCertificate5.mmIssuer);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IdentificationIssuerRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EntityName";
			definition = "Entity that issues the proprietary identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationIssuerRole obj) {
			return obj.getEntityName();
		}

		@Override
		public void setValue(IdentificationIssuerRole obj, Max35Text value) {
			obj.setEntityName(value);
		}
	};
	protected Max35Text ownerCode;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<IdentificationIssuerRole, Max35Text> mmOwnerCode = new MMBusinessAttribute<IdentificationIssuerRole, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.IdentificationIssuerRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OwnerCode";
			definition = "Code representing the organisation that owns and is responsible of an enumerated code list, for example ISO.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationIssuerRole obj) {
			return obj.getOwnerCode();
		}

		@Override
		public void setValue(IdentificationIssuerRole obj, Max35Text value) {
			obj.setOwnerCode(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationIssuerRole";
				definition = "Entity that assigns the identification.";
				derivationElement_lazy = () -> Arrays.asList(GenericIdentification1.mmIssuer, GenericIdentification7.mmIssuer, GenericIdentification8.mmIssuer, GenericIdentification9.mmIssuer, GenericIdentification13.mmIssuer,
						GenericIdentification20.mmIssuer, GenericIdentification25.mmIssuer, GenericIdentification47.mmIssuer, GenericIdentification44.mmIssuer, GenericIdentification41.mmIssuer, GenericIdentification3.mmIssuer,
						GenericFinancialIdentification1.mmIssuer, GenericAccountIdentification1.mmIssuer, PersonIdentification3.mmIssuer, GenericOrganisationIdentification1.mmIssuer, GenericPersonIdentification1.mmIssuer,
						GenericIdentification19.mmIssuer, GenericIdentification24.mmIssuer, GenericOrganisationIdentification2.mmIssuer, GenericIdentification37.mmIssuer, GenericIdentification23.mmIssuer, GenericIdentification18.mmIssuer,
						GenericIdentification39.mmIssuer, GenericIdentification27.mmIssuer, GenericIdentification22.mmIssuer, GenericIdentification28.mmIssuer, GenericIdentification6.mmIssuer, GenericIdentification5.mmIssuer,
						GenericIdentification34.mmIssuer, GenericIdentification38.mmIssuer, GenericIdentification29.mmIssuer, GenericIdentification36.mmIssuer, ProprietaryBankTransactionCodeStructure1.mmIssuer,
						GenericIdentification32.mmIssuer, GenericIdentification35.mmIssuer, GenericIdentification48.mmIssuer, GenericIdentification31.mmIssuer, GenericIdentification33.mmIssuer, GenericIdentification2.mmIssuer,
						GenericIdentification11.mmIssuer, PersonIdentification2.mmIssuer, GenericIdentification16.mmIssuer, GenericIdentification30.mmIssuer, BillingServiceCommonIdentification1.mmIssuer, GenericIdentification12.mmIssuer,
						GenericIdentification17.mmIssuer, GenericIdentification40.mmIssuer, GenericIdentification15.mmIssuer, GenericIdentification42.mmIssuer, GenericIdentification51.mmIssuer, GenericIdentification55.mmIssuer,
						GenericIdentification56.mmIssuer, GenericIdentification65.mmIssuer, GenericIdentification63.mmIssuer, GenericIdentification66.mmIssuer, GenericIdentification62.mmIssuer, GenericIdentification60.mmIssuer,
						GenericIdentification64.mmIssuer, GenericIdentification67.mmIssuer, GenericIdentification53.mmIssuer, GenericIdentification71.mmIssuer, GenericIdentification73.mmIssuer, GenericIdentification74.mmIssuer,
						GenericIdentification72.mmIssuer, GenericIdentification70.mmIssuer, GenericIdentification75.mmIssuer, GenericIdentification76.mmIssuer, GenericIdentification77.mmIssuer, AlternateIdentification4.mmIssuer,
						GenericIdentification82.mmIssuer, GenericIdentification84.mmIssuer, GenericIdentification86.mmIssuer, GenericIdentification144.mmIssuer, GenericIdentification163.mmIssuer, GenericIdentification79.mmIssuer,
						GenericIdentification94.mmIssuer, GenericIdentification90.mmIssuer, GenericIdentification93.mmIssuer, GenericIdentification92.mmIssuer, GenericIdentification164.mmIssuer, GenericIdentification165.mmIssuer,
						GenericIdentification166.mmIssuer, GenericIdentification169.mmIssuer, GenericIdentification168.mmIssuer, GenericIdentification172.mmIssuer, GenericIdentification167.mmIssuer, GenericIdentification170.mmIssuer);
				superType_lazy = () -> InformationPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.IdentificationIssuerRole.mmCountry, com.tools20022.repository.entity.IdentificationIssuerRole.mmEntityName,
						com.tools20022.repository.entity.IdentificationIssuerRole.mmOwnerCode);
				derivationComponent_lazy = () -> Arrays.asList(IdentificationSource1Choice.mmObject(), IdentificationSource3Choice.mmObject(), IdentificationSource4Choice.mmObject(), IdentificationSource2Choice.mmObject(),
						IdentificationSource5Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return IdentificationIssuerRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getCountry() {
		return country;
	}

	public IdentificationIssuerRole setCountry(CountryCode country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public Max35Text getEntityName() {
		return entityName;
	}

	public IdentificationIssuerRole setEntityName(Max35Text entityName) {
		this.entityName = Objects.requireNonNull(entityName);
		return this;
	}

	public Max35Text getOwnerCode() {
		return ownerCode;
	}

	public IdentificationIssuerRole setOwnerCode(Max35Text ownerCode) {
		this.ownerCode = Objects.requireNonNull(ownerCode);
		return this;
	}
}