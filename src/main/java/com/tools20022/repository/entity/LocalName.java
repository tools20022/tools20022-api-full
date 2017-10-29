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
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.FinancialInstrumentName1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Name of the security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="LocalName" src="doc-files/LocalName.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#FullName
 * LocalName.FullName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#RelatedSecurity
 * LocalName.RelatedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#ShortName
 * LocalName.ShortName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#Language
 * LocalName.Language}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Name
 * SecuritiesIdentification.Name}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrumentName1
 * FinancialInstrumentName1}</li>
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
 * "LocalName"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Name of the security."</li>
 * </ul>
 */
public class LocalName {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name of the security.
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
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument16#Name
	 * FinancialInstrument16.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#Name
	 * SecurityIdentification1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument17#Name
	 * FinancialInstrument17.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument6#Name
	 * FinancialInstrument6.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument10#Name
	 * FinancialInstrument10.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument29#Name
	 * FinancialInstrument29.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument7#Name
	 * FinancialInstrument7.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument12#Name
	 * FinancialInstrument12.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument26#Name
	 * FinancialInstrument26.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument30#Name
	 * FinancialInstrument30.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument11#Name
	 * FinancialInstrument11.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument25#Name
	 * FinancialInstrument25.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument27#Name
	 * FinancialInstrument27.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument32#Name
	 * FinancialInstrument32.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument24#Name
	 * FinancialInstrument24.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument33#Name
	 * FinancialInstrument33.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument23#Name
	 * FinancialInstrument23.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument31#Name
	 * FinancialInstrument31.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument3#Name
	 * FinancialInstrument3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument5#Name
	 * FinancialInstrument5.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument8#Name
	 * FinancialInstrument8.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument13#Name
	 * FinancialInstrument13.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument4#Name
	 * FinancialInstrument4.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#Name
	 * FinancialInstrumentAttributes1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument9#Name
	 * FinancialInstrument9.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument18#Name
	 * FinancialInstrument18.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument19#Name
	 * FinancialInstrument19.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#ISOSecurityLongName
	 * CommonFinancialInstrumentAttributes1.ISOSecurityLongName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentName1#ISOLongName
	 * FinancialInstrumentName1.ISOLongName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument37#Name
	 * FinancialInstrument37.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument35#Name
	 * FinancialInstrument35.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument34#Name
	 * FinancialInstrument34.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument36#Name
	 * FinancialInstrument36.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#Name Fund2.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#Name Fund1.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument40#Name
	 * FinancialInstrument40.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument39#Name
	 * FinancialInstrument39.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#Name Fund3.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#Name Fund4.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument51#Name
	 * FinancialInstrument51.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument50#Name
	 * FinancialInstrument50.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument45#Name
	 * FinancialInstrument45.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument49#Name
	 * FinancialInstrument49.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument48#Name
	 * FinancialInstrument48.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument47#Name
	 * FinancialInstrument47.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument46#Name
	 * FinancialInstrument46.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#FullName
	 * SecurityInstrumentDescription9.FullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#FullName
	 * SecurityInstrumentDescription11.FullName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument57#Name
	 * FinancialInstrument57.Name}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument56#Name
	 * FinancialInstrument56.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#FinancialInstrumentName
	 * HoldBackInformation2.FinancialInstrumentName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument55#Name
	 * FinancialInstrument55.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#FullName
	 * TransparencyDataReport11.FullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#FullName
	 * TransparencyDataReport12.FullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#FullName
	 * TransparencyDataReport10.FullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#FullName
	 * TransparencyDataReport14.FullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#FinancialInstrumentName
	 * HoldBackInformation3.FinancialInstrumentName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LocalName
	 * LocalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the security."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FullName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.Name, com.tools20022.repository.msg.SecurityIdentification1.Name, com.tools20022.repository.msg.FinancialInstrument17.Name,
					com.tools20022.repository.msg.FinancialInstrument6.Name, com.tools20022.repository.msg.FinancialInstrument10.Name, com.tools20022.repository.msg.FinancialInstrument29.Name,
					com.tools20022.repository.msg.FinancialInstrument7.Name, com.tools20022.repository.msg.FinancialInstrument12.Name, com.tools20022.repository.msg.FinancialInstrument26.Name,
					com.tools20022.repository.msg.FinancialInstrument30.Name, com.tools20022.repository.msg.FinancialInstrument11.Name, com.tools20022.repository.msg.FinancialInstrument25.Name,
					com.tools20022.repository.msg.FinancialInstrument27.Name, com.tools20022.repository.msg.FinancialInstrument32.Name, com.tools20022.repository.msg.FinancialInstrument24.Name,
					com.tools20022.repository.msg.FinancialInstrument33.Name, com.tools20022.repository.msg.FinancialInstrument23.Name, com.tools20022.repository.msg.FinancialInstrument31.Name,
					com.tools20022.repository.msg.FinancialInstrument3.Name, com.tools20022.repository.msg.FinancialInstrument5.Name, com.tools20022.repository.msg.FinancialInstrument8.Name,
					com.tools20022.repository.msg.FinancialInstrument13.Name, com.tools20022.repository.msg.FinancialInstrument4.Name, com.tools20022.repository.msg.FinancialInstrumentAttributes1.Name,
					com.tools20022.repository.msg.FinancialInstrument9.Name, com.tools20022.repository.msg.FinancialInstrument18.Name, com.tools20022.repository.msg.FinancialInstrument19.Name,
					com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.ISOSecurityLongName, com.tools20022.repository.msg.FinancialInstrumentName1.ISOLongName, com.tools20022.repository.msg.FinancialInstrument37.Name,
					com.tools20022.repository.msg.FinancialInstrument35.Name, com.tools20022.repository.msg.FinancialInstrument34.Name, com.tools20022.repository.msg.FinancialInstrument36.Name, com.tools20022.repository.msg.Fund2.Name,
					com.tools20022.repository.msg.Fund1.Name, com.tools20022.repository.msg.FinancialInstrument40.Name, com.tools20022.repository.msg.FinancialInstrument39.Name, com.tools20022.repository.msg.Fund3.Name,
					com.tools20022.repository.msg.Fund4.Name, com.tools20022.repository.msg.FinancialInstrument51.Name, com.tools20022.repository.msg.FinancialInstrument50.Name, com.tools20022.repository.msg.FinancialInstrument45.Name,
					com.tools20022.repository.msg.FinancialInstrument49.Name, com.tools20022.repository.msg.FinancialInstrument48.Name, com.tools20022.repository.msg.FinancialInstrument47.Name,
					com.tools20022.repository.msg.FinancialInstrument46.Name, com.tools20022.repository.msg.SecurityInstrumentDescription9.FullName, com.tools20022.repository.msg.SecurityInstrumentDescription11.FullName,
					com.tools20022.repository.msg.FinancialInstrument57.Name, com.tools20022.repository.msg.FinancialInstrument56.Name, com.tools20022.repository.msg.HoldBackInformation2.FinancialInstrumentName,
					com.tools20022.repository.msg.FinancialInstrument55.Name, com.tools20022.repository.msg.TransparencyDataReport11.FullName, com.tools20022.repository.msg.TransparencyDataReport12.FullName,
					com.tools20022.repository.msg.TransparencyDataReport10.FullName, com.tools20022.repository.msg.TransparencyDataReport14.FullName, com.tools20022.repository.msg.HoldBackInformation3.FinancialInstrumentName);
			elementContext_lazy = () -> LocalName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullName";
			definition = "Name of the security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Identification which contains a name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Name
	 * SecuritiesIdentification.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LocalName
	 * LocalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification which contains a name."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> LocalName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecurity";
			definition = "Identification which contains a name.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.Name;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Short name of the security
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#ISOSecurityShortName
	 * CommonFinancialInstrumentAttributes1.ISOSecurityShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentName1#ISOShortName
	 * FinancialInstrumentName1.ISOShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#ShortName
	 * FinancialInstrument51.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument50#ShortName
	 * FinancialInstrument50.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument45#ShortName
	 * FinancialInstrument45.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#ShortName
	 * FinancialInstrument49.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#ShortName
	 * FinancialInstrument48.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#ShortName
	 * FinancialInstrument47.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#ShortName
	 * FinancialInstrument46.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#ShortName
	 * SecurityInstrumentDescription9.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#ShortName
	 * FinancialInstrument57.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#ShortName
	 * FinancialInstrument56.ShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#ShortName
	 * FinancialInstrument55.ShortName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LocalName
	 * LocalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short name of the security"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ShortName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1.ISOSecurityShortName, com.tools20022.repository.msg.FinancialInstrumentName1.ISOShortName,
					com.tools20022.repository.msg.FinancialInstrument51.ShortName, com.tools20022.repository.msg.FinancialInstrument50.ShortName, com.tools20022.repository.msg.FinancialInstrument45.ShortName,
					com.tools20022.repository.msg.FinancialInstrument49.ShortName, com.tools20022.repository.msg.FinancialInstrument48.ShortName, com.tools20022.repository.msg.FinancialInstrument47.ShortName,
					com.tools20022.repository.msg.FinancialInstrument46.ShortName, com.tools20022.repository.msg.SecurityInstrumentDescription9.ShortName, com.tools20022.repository.msg.FinancialInstrument57.ShortName,
					com.tools20022.repository.msg.FinancialInstrument56.ShortName, com.tools20022.repository.msg.FinancialInstrument55.ShortName);
			elementContext_lazy = () -> LocalName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShortName";
			definition = "Short name of the security";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Language in which the security name is expressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.LocalName
	 * LocalName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language in which the security name is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> LocalName.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which the security name is expressed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LocalName";
				definition = "Name of the security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.Name);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LocalName.FullName, com.tools20022.repository.entity.LocalName.RelatedSecurity, com.tools20022.repository.entity.LocalName.ShortName,
						com.tools20022.repository.entity.LocalName.Language);
				derivationComponent_lazy = () -> Arrays.asList(FinancialInstrumentName1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}