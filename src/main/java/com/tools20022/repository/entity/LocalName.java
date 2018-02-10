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
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#mmFullName
 * LocalName.mmFullName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#mmRelatedSecurity
 * LocalName.mmRelatedSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#mmShortName
 * LocalName.mmShortName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#mmLanguage
 * LocalName.mmLanguage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmName
 * SecuritiesIdentification.mmName}</li>
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
	protected Max350Text fullName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmName
	 * FinancialInstrument16.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification1#mmName
	 * SecurityIdentification1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument17#mmName
	 * FinancialInstrument17.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument6#mmName
	 * FinancialInstrument6.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument10#mmName
	 * FinancialInstrument10.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmName
	 * FinancialInstrument29.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument7#mmName
	 * FinancialInstrument7.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument12#mmName
	 * FinancialInstrument12.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument26#mmName
	 * FinancialInstrument26.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument30#mmName
	 * FinancialInstrument30.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument11#mmName
	 * FinancialInstrument11.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument25#mmName
	 * FinancialInstrument25.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument27#mmName
	 * FinancialInstrument27.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument32#mmName
	 * FinancialInstrument32.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument24#mmName
	 * FinancialInstrument24.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument33#mmName
	 * FinancialInstrument33.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument23#mmName
	 * FinancialInstrument23.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument31#mmName
	 * FinancialInstrument31.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument3#mmName
	 * FinancialInstrument3.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument5#mmName
	 * FinancialInstrument5.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument8#mmName
	 * FinancialInstrument8.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument13#mmName
	 * FinancialInstrument13.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument4#mmName
	 * FinancialInstrument4.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmName
	 * FinancialInstrumentAttributes1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument9#mmName
	 * FinancialInstrument9.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument18#mmName
	 * FinancialInstrument18.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument19#mmName
	 * FinancialInstrument19.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmISOSecurityLongName
	 * CommonFinancialInstrumentAttributes1.mmISOSecurityLongName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentName1#mmISOLongName
	 * FinancialInstrumentName1.mmISOLongName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument37#mmName
	 * FinancialInstrument37.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument35#mmName
	 * FinancialInstrument35.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument34#mmName
	 * FinancialInstrument34.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument36#mmName
	 * FinancialInstrument36.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmName Fund2.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmName Fund1.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument40#mmName
	 * FinancialInstrument40.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument39#mmName
	 * FinancialInstrument39.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmName Fund3.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#mmName Fund4.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmName
	 * FinancialInstrument51.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument50#mmName
	 * FinancialInstrument50.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument45#mmName
	 * FinancialInstrument45.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#mmName
	 * FinancialInstrument49.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmName
	 * FinancialInstrument48.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmName
	 * FinancialInstrument47.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmName
	 * FinancialInstrument46.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmFullName
	 * SecurityInstrumentDescription9.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmFullName
	 * SecurityInstrumentDescription11.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmName
	 * FinancialInstrument57.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmName
	 * FinancialInstrument56.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmFinancialInstrumentName
	 * HoldBackInformation2.mmFinancialInstrumentName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmName
	 * FinancialInstrument55.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmFullName
	 * TransparencyDataReport11.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport12#mmFullName
	 * TransparencyDataReport12.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmFullName
	 * TransparencyDataReport10.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport14#mmFullName
	 * TransparencyDataReport14.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmFinancialInstrumentName
	 * HoldBackInformation3.mmFinancialInstrumentName}</li>
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
	public static final MMBusinessAttribute mmFullName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument16.mmName, SecurityIdentification1.mmName, FinancialInstrument17.mmName, FinancialInstrument6.mmName, FinancialInstrument10.mmName, FinancialInstrument29.mmName,
					FinancialInstrument7.mmName, FinancialInstrument12.mmName, FinancialInstrument26.mmName, FinancialInstrument30.mmName, FinancialInstrument11.mmName, FinancialInstrument25.mmName, FinancialInstrument27.mmName,
					FinancialInstrument32.mmName, FinancialInstrument24.mmName, FinancialInstrument33.mmName, FinancialInstrument23.mmName, FinancialInstrument31.mmName, FinancialInstrument3.mmName, FinancialInstrument5.mmName,
					FinancialInstrument8.mmName, FinancialInstrument13.mmName, FinancialInstrument4.mmName, FinancialInstrumentAttributes1.mmName, FinancialInstrument9.mmName, FinancialInstrument18.mmName, FinancialInstrument19.mmName,
					CommonFinancialInstrumentAttributes1.mmISOSecurityLongName, FinancialInstrumentName1.mmISOLongName, FinancialInstrument37.mmName, FinancialInstrument35.mmName, FinancialInstrument34.mmName, FinancialInstrument36.mmName,
					Fund2.mmName, Fund1.mmName, FinancialInstrument40.mmName, FinancialInstrument39.mmName, Fund3.mmName, Fund4.mmName, FinancialInstrument51.mmName, FinancialInstrument50.mmName, FinancialInstrument45.mmName,
					FinancialInstrument49.mmName, FinancialInstrument48.mmName, FinancialInstrument47.mmName, FinancialInstrument46.mmName, SecurityInstrumentDescription9.mmFullName, SecurityInstrumentDescription11.mmFullName,
					FinancialInstrument57.mmName, FinancialInstrument56.mmName, HoldBackInformation2.mmFinancialInstrumentName, FinancialInstrument55.mmName, TransparencyDataReport11.mmFullName, TransparencyDataReport12.mmFullName,
					TransparencyDataReport10.mmFullName, TransparencyDataReport14.mmFullName, HoldBackInformation3.mmFinancialInstrumentName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LocalName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullName";
			definition = "Name of the security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LocalName.class.getMethod("getFullName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesIdentification relatedSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmName
	 * SecuritiesIdentification.mmName}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LocalName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecurity";
			definition = "Identification which contains a name.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmName;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
		}
	};
	protected Max35Text shortName;
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
	 * {@linkplain com.tools20022.repository.msg.CommonFinancialInstrumentAttributes1#mmISOSecurityShortName
	 * CommonFinancialInstrumentAttributes1.mmISOSecurityShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentName1#mmISOShortName
	 * FinancialInstrumentName1.mmISOShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmShortName
	 * FinancialInstrument51.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument50#mmShortName
	 * FinancialInstrument50.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument45#mmShortName
	 * FinancialInstrument45.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49#mmShortName
	 * FinancialInstrument49.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument48#mmShortName
	 * FinancialInstrument48.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument47#mmShortName
	 * FinancialInstrument47.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument46#mmShortName
	 * FinancialInstrument46.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmShortName
	 * SecurityInstrumentDescription9.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument57#mmShortName
	 * FinancialInstrument57.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmShortName
	 * FinancialInstrument56.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument55#mmShortName
	 * FinancialInstrument55.mmShortName}</li>
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
	public static final MMBusinessAttribute mmShortName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CommonFinancialInstrumentAttributes1.mmISOSecurityShortName, FinancialInstrumentName1.mmISOShortName, FinancialInstrument51.mmShortName, FinancialInstrument50.mmShortName,
					FinancialInstrument45.mmShortName, FinancialInstrument49.mmShortName, FinancialInstrument48.mmShortName, FinancialInstrument47.mmShortName, FinancialInstrument46.mmShortName, SecurityInstrumentDescription9.mmShortName,
					FinancialInstrument57.mmShortName, FinancialInstrument56.mmShortName, FinancialInstrument55.mmShortName);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LocalName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShortName";
			definition = "Short name of the security";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LocalName.class.getMethod("getShortName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LanguageCode language;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmLanguage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.LocalName.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which the security name is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return LocalName.class.getMethod("getLanguage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LocalName";
				definition = "Name of the security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.mmName);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.LocalName.mmFullName, com.tools20022.repository.entity.LocalName.mmRelatedSecurity, com.tools20022.repository.entity.LocalName.mmShortName,
						com.tools20022.repository.entity.LocalName.mmLanguage);
				derivationComponent_lazy = () -> Arrays.asList(FinancialInstrumentName1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return LocalName.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getFullName() {
		return fullName;
	}

	public LocalName setFullName(Max350Text fullName) {
		this.fullName = Objects.requireNonNull(fullName);
		return this;
	}

	public Optional<SecuritiesIdentification> getRelatedSecurity() {
		return relatedSecurity == null ? Optional.empty() : Optional.of(relatedSecurity);
	}

	public LocalName setRelatedSecurity(com.tools20022.repository.entity.SecuritiesIdentification relatedSecurity) {
		this.relatedSecurity = relatedSecurity;
		return this;
	}

	public Max35Text getShortName() {
		return shortName;
	}

	public LocalName setShortName(Max35Text shortName) {
		this.shortName = Objects.requireNonNull(shortName);
		return this;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public LocalName setLanguage(LanguageCode language) {
		this.language = Objects.requireNonNull(language);
		return this;
	}
}