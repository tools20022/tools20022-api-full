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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.codeset.ProductTypeCode;
import com.tools20022.repository.datatype.CFIOct2015Identifier;
import com.tools20022.repository.msg.AssetClass2;
import com.tools20022.repository.msg.ClassificationType1;
import com.tools20022.repository.msg.FinancialInstrumentClassification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Other classification type of the security, ie, other than ISO 10962.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AssetClassification" src="doc-files/AssetClassification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#ClassificationType
 * AssetClassification.ClassificationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetClassification#Asset
 * AssetClassification.Asset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#Language
 * AssetClassification.Language}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#AssetClassScheme
 * AssetClassification.AssetClassScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#ProductType
 * AssetClassification.ProductType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#Strategy
 * AssetClassification.Strategy}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#AssetClassification
 * Asset.AssetClassification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Scheme#AssetClassification
 * Scheme.AssetClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassStrategy#AssetClass
 * AssetClassStrategy.AssetClass}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentClassification1#ClassificationType
 * FinancialInstrumentClassification1.ClassificationType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ClassificationType1Choice
 * ClassificationType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClassificationType2Choice
 * ClassificationType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClassificationType3Choice
 * ClassificationType3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClassificationType4Choice
 * ClassificationType4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityClassificationType1Choice
 * SecurityClassificationType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClassificationType30Choice
 * ClassificationType30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClassificationType1
 * ClassificationType1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentClassification1
 * FinancialInstrumentClassification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProductType1Choice
 * FinancialInstrumentProductType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClassificationType32Choice
 * ClassificationType32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClassificationType33Choice
 * ClassificationType33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2 AssetClass2}</li>
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
 * "AssetClassification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Other classification type of the security, ie, other than ISO 10962."</li>
 * </ul>
 */
public class AssetClassification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Classification type of the financial instrument, as per the ISO
	 * Classification of Financial Instrument (CFI) codification, for example,
	 * common share with voting rights, fully paid, or registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CFIOct2015Identifier
	 * CFIOct2015Identifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType1Choice#ClassificationFinancialInstrument
	 * ClassificationType1Choice.ClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType1Choice#AlternateClassification
	 * ClassificationType1Choice.AlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType2Choice#ClassificationFinancialInstrument
	 * ClassificationType2Choice.ClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType2Choice#AlternateClassification
	 * ClassificationType2Choice.AlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#ClassificationType
	 * FinancialInstrumentAttributes8.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#ClassificationType
	 * FinancialInstrumentAttributes20.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#ClassificationType
	 * FinancialInstrumentAttributes35.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType3Choice#ClassificationFinancialInstrument
	 * ClassificationType3Choice.ClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType3Choice#AlternateClassification
	 * ClassificationType3Choice.AlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#ClassificationType
	 * FinancialInstrumentAttributes41.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#ClassificationType
	 * FinancialInstrumentAttributes6.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#ClassificationType
	 * FinancialInstrumentAttributes9.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#ClassificationType
	 * FinancialInstrumentAttributes18.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#ClassificationType
	 * FinancialInstrumentAttributes22.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#ClassificationType
	 * FinancialInstrumentAttributes32.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#ClassificationType
	 * FinancialInstrumentAttributes38.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#ClassificationType
	 * FinancialInstrumentAttributes7.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#ClassificationType
	 * FinancialInstrumentAttributes5.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#ClassificationType
	 * FinancialInstrumentAttributes11.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#ClassificationType
	 * FinancialInstrumentAttributes10.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#ClassificationType
	 * FinancialInstrumentAttributes19.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#ClassificationType
	 * FinancialInstrumentAttributes16.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#ClassificationType
	 * FinancialInstrumentAttributes23.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#ClassificationType
	 * FinancialInstrumentAttributes24.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#ClassificationType
	 * FinancialInstrumentAttributes33.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#ClassificationType
	 * FinancialInstrumentAttributes34.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#ClassificationType
	 * FinancialInstrumentAttributes39.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#ClassificationType
	 * FinancialInstrumentAttributes40.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#ClassificationType
	 * FinancialInstrumentAttributes43.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#ClassificationType
	 * FinancialInstrumentAttributes45.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#ClassificationType
	 * FinancialInstrumentAttributes4.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#ClassificationType
	 * FinancialInstrumentAttributes13.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#ClassificationType
	 * FinancialInstrumentAttributes21.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#ClassificationType
	 * FinancialInstrumentAttributes26.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#ClassificationType
	 * FinancialInstrumentAttributes36.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#ClassificationType
	 * FinancialInstrumentAttributes42.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#ClassificationType
	 * FinancialInstrumentAttributes27.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#ClassificationType
	 * FinancialInstrumentAttributes14.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#ClassificationType
	 * FinancialInstrumentAttributes30.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#ClassificationType
	 * FinancialInstrumentAttributes28.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType4Choice#ClassificationFinancialInstrument
	 * ClassificationType4Choice.ClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType4Choice#AlternateClassification
	 * ClassificationType4Choice.AlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityClassificationType1Choice#CFI
	 * SecurityClassificationType1Choice.CFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityClassificationType1Choice#AlternateClassification
	 * SecurityClassificationType1Choice.AlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#ClassificationType
	 * FinancialInstrumentAttributes1.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType30Choice#ClassificationFinancialInstrument
	 * ClassificationType30Choice.ClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType30Choice#AlternateClassification
	 * ClassificationType30Choice.AlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#ClassificationType
	 * FinancialInstrumentAttributes31.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#ClassificationType
	 * FinancialInstrumentAttributes44.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1#ClassificationType
	 * SecurityInstrumentDescription1.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2#ClassificationType
	 * SecurityInstrumentDescription2.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#ClassificationType
	 * FinancialInstrumentAttributes15.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#ClassificationType
	 * FinancialInstrumentAttributes29.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClassificationType1#ClassificationFinancialInstrument
	 * ClassificationType1.ClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClassificationType1#AlternateClassification
	 * ClassificationType1.AlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#ClassificationType
	 * FinancialInstrumentAttributes2.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#ClassificationType
	 * FinancialInstrumentAttributes48.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#ClassificationType
	 * FinancialInstrumentAttributes50.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#ClassificationType
	 * FinancialInstrumentAttributes49.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#ClassificationType
	 * FinancialInstrumentAttributes55.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#ClassificationType
	 * FinancialInstrumentAttributes57.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#ClassificationType
	 * FinancialInstrumentAttributes56.ClassificationType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation4#Type
	 * CollateralValuation4.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#ClassificationType
	 * FinancialInstrumentAttributes63.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#ClassificationType
	 * FinancialInstrumentAttributes64.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#ClassificationType
	 * FinancialInstrumentAttributes66.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#ClassificationType
	 * FinancialInstrumentAttributes65.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#ClassificationType
	 * FinancialInstrumentAttributes67.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType32Choice#ClassificationFinancialInstrument
	 * ClassificationType32Choice.ClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType32Choice#AlternateClassification
	 * ClassificationType32Choice.AlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType33Choice#ClassificationFinancialInstrument
	 * ClassificationType33Choice.ClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType33Choice#AlternateClassification
	 * ClassificationType33Choice.AlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#ClassificationType
	 * FinancialInstrumentAttributes70.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#ClassificationType
	 * FinancialInstrumentAttributes69.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#ClassificationType
	 * FinancialInstrumentAttributes71.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#ClassificationType
	 * FinancialInstrumentAttributes75.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#ClassificationType
	 * FinancialInstrumentAttributes78.ClassificationType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation7#Type
	 * CollateralValuation7.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#ClassificationType
	 * SecurityInstrumentDescription9.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#ClassificationType
	 * SecurityInstrumentDescription11.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#FinancialInstrumentClassification
	 * TransparencyDataReport11.FinancialInstrumentClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#FinancialInstrumentClassification
	 * TransparencyDataReport10.FinancialInstrumentClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#ClassificationType
	 * FinancialInstrumentAttributes79.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#ClassificationType
	 * FinancialInstrumentAttributes81.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#ClassificationType
	 * FinancialInstrumentAttributes80.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#ClassificationType
	 * FinancialInstrumentAttributes85.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#ClassificationType
	 * FinancialInstrumentAttributes84.ClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#ClassificationType
	 * FinancialInstrumentAttributes83.ClassificationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClassificationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ClassificationType1Choice.ClassificationFinancialInstrument, com.tools20022.repository.choice.ClassificationType1Choice.AlternateClassification,
					com.tools20022.repository.choice.ClassificationType2Choice.ClassificationFinancialInstrument, com.tools20022.repository.choice.ClassificationType2Choice.AlternateClassification,
					com.tools20022.repository.msg.FinancialInstrumentAttributes8.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes20.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.ClassificationType, com.tools20022.repository.choice.ClassificationType3Choice.ClassificationFinancialInstrument,
					com.tools20022.repository.choice.ClassificationType3Choice.AlternateClassification, com.tools20022.repository.msg.FinancialInstrumentAttributes41.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes6.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes9.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes18.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes22.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes32.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes38.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes7.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes5.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes11.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes10.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes19.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes16.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes23.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes24.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes33.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes34.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes39.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes40.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes43.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes45.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes13.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes26.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes42.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes14.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes28.ClassificationType,
					com.tools20022.repository.choice.ClassificationType4Choice.ClassificationFinancialInstrument, com.tools20022.repository.choice.ClassificationType4Choice.AlternateClassification,
					com.tools20022.repository.choice.SecurityClassificationType1Choice.CFI, com.tools20022.repository.choice.SecurityClassificationType1Choice.AlternateClassification,
					com.tools20022.repository.msg.FinancialInstrumentAttributes1.ClassificationType, com.tools20022.repository.choice.ClassificationType30Choice.ClassificationFinancialInstrument,
					com.tools20022.repository.choice.ClassificationType30Choice.AlternateClassification, com.tools20022.repository.msg.FinancialInstrumentAttributes31.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.ClassificationType, com.tools20022.repository.msg.SecurityInstrumentDescription1.ClassificationType,
					com.tools20022.repository.msg.SecurityInstrumentDescription2.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes15.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes29.ClassificationType, com.tools20022.repository.msg.ClassificationType1.ClassificationFinancialInstrument,
					com.tools20022.repository.msg.ClassificationType1.AlternateClassification, com.tools20022.repository.msg.FinancialInstrumentAttributes2.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes48.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes50.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes49.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes55.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes57.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes56.ClassificationType,
					com.tools20022.repository.msg.CollateralValuation4.Type, com.tools20022.repository.msg.FinancialInstrumentAttributes63.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes66.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes65.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes67.ClassificationType,
					com.tools20022.repository.choice.ClassificationType32Choice.ClassificationFinancialInstrument, com.tools20022.repository.choice.ClassificationType32Choice.AlternateClassification,
					com.tools20022.repository.choice.ClassificationType33Choice.ClassificationFinancialInstrument, com.tools20022.repository.choice.ClassificationType33Choice.AlternateClassification,
					com.tools20022.repository.msg.FinancialInstrumentAttributes70.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes69.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes71.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes75.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.ClassificationType, com.tools20022.repository.msg.CollateralValuation7.Type, com.tools20022.repository.msg.SecurityInstrumentDescription9.ClassificationType,
					com.tools20022.repository.msg.SecurityInstrumentDescription11.ClassificationType, com.tools20022.repository.msg.TransparencyDataReport11.FinancialInstrumentClassification,
					com.tools20022.repository.msg.TransparencyDataReport10.FinancialInstrumentClassification, com.tools20022.repository.msg.FinancialInstrumentAttributes79.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes81.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes80.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes85.ClassificationType, com.tools20022.repository.msg.FinancialInstrumentAttributes84.ClassificationType,
					com.tools20022.repository.msg.FinancialInstrumentAttributes83.ClassificationType);
			elementContext_lazy = () -> AssetClassification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CFIOct2015Identifier.mmObject();
		}
	};
	/**
	 * Asset for which classification information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#AssetClassification
	 * Asset.AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset for which classification information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Asset = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetClassification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Asset for which classification information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.AssetClassification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Language in which the asset classification is expressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language in which the asset classification is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Language = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AssetClassification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which the asset classification is expressed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	/**
	 * Information regarding the entity that assigns the asset classification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#AssetClassification
	 * Scheme.AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Scheme Scheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetClassScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information regarding the entity that assigns the asset classification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssetClassScheme = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetClassification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetClassScheme";
			definition = "Information regarding the entity that assigns the asset classification.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Scheme.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.AssetClassification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the product type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProductTypeCode
	 * ProductTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClassificationType1#FinancialInstrumentProductTypeCode
	 * ClassificationType1.FinancialInstrumentProductTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProductType1Choice#Code
	 * FinancialInstrumentProductType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProductType1Choice#Proprietary
	 * FinancialInstrumentProductType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#InstrumentType
	 * UnsecuredMarketTransaction1.InstrumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#InstrumentType
	 * UnsecuredMarketTransaction2.InstrumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#InstrumentType
	 * UnsecuredMarketTransaction3.InstrumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#DerivativeContractType
	 * TransparencyDataReport10.DerivativeContractType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DebtInstrument5#Type
	 * DebtInstrument5.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#Basket
	 * EquityDerivative3Choice.Basket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#Index
	 * EquityDerivative3Choice.Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#SingleName
	 * EquityDerivative3Choice.SingleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#Other
	 * EquityDerivative3Choice.Other}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#InstrumentType
	 * UnsecuredMarketTransaction4.InstrumentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the product type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProductType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ClassificationType1.FinancialInstrumentProductTypeCode, com.tools20022.repository.choice.FinancialInstrumentProductType1Choice.Code,
					com.tools20022.repository.choice.FinancialInstrumentProductType1Choice.Proprietary, com.tools20022.repository.msg.UnsecuredMarketTransaction1.InstrumentType,
					com.tools20022.repository.msg.UnsecuredMarketTransaction2.InstrumentType, com.tools20022.repository.msg.UnsecuredMarketTransaction3.InstrumentType,
					com.tools20022.repository.msg.TransparencyDataReport10.DerivativeContractType, com.tools20022.repository.msg.DebtInstrument5.Type, com.tools20022.repository.choice.EquityDerivative3Choice.Basket,
					com.tools20022.repository.choice.EquityDerivative3Choice.Index, com.tools20022.repository.choice.EquityDerivative3Choice.SingleName, com.tools20022.repository.choice.EquityDerivative3Choice.Other,
					com.tools20022.repository.msg.UnsecuredMarketTransaction4.InstrumentType);
			elementContext_lazy = () -> AssetClassification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductType";
			definition = "Identifies the product type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ProductTypeCode.mmObject();
		}
	};
	/**
	 * Strategy related to a class of assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassStrategy#AssetClass
	 * AssetClassStrategy.AssetClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetClassStrategy
	 * AssetClassStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Strategy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Strategy related to a class of assets."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Strategy = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AssetClassification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy related to a class of assets.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AssetClassStrategy.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassStrategy.AssetClass;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AssetClassification";
				definition = "Other classification type of the security, ie, other than ISO 10962.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.AssetClassification, com.tools20022.repository.entity.Scheme.AssetClassification,
						com.tools20022.repository.entity.AssetClassStrategy.AssetClass);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentClassification1.ClassificationType);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetClassification.ClassificationType, com.tools20022.repository.entity.AssetClassification.Asset,
						com.tools20022.repository.entity.AssetClassification.Language, com.tools20022.repository.entity.AssetClassification.AssetClassScheme, com.tools20022.repository.entity.AssetClassification.ProductType,
						com.tools20022.repository.entity.AssetClassification.Strategy);
				derivationComponent_lazy = () -> Arrays.asList(ClassificationType1Choice.mmObject(), ClassificationType2Choice.mmObject(), ClassificationType3Choice.mmObject(), ClassificationType4Choice.mmObject(),
						SecurityClassificationType1Choice.mmObject(), ClassificationType30Choice.mmObject(), ClassificationType1.mmObject(), FinancialInstrumentClassification1.mmObject(), FinancialInstrumentProductType1Choice.mmObject(),
						ClassificationType32Choice.mmObject(), ClassificationType33Choice.mmObject(), AssetClass2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}