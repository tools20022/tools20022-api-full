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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.codeset.ProductTypeCode;
import com.tools20022.repository.datatype.CFIOct2015Identifier;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmClassificationType
 * AssetClassification.mmClassificationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetClassification#mmAsset
 * AssetClassification.mmAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmLanguage
 * AssetClassification.mmLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmAssetClassScheme
 * AssetClassification.mmAssetClassScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmProductType
 * AssetClassification.mmProductType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmStrategy
 * AssetClassification.mmStrategy}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#mmAssetClassification
 * Asset.mmAssetClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Scheme#mmAssetClassification
 * Scheme.mmAssetClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetClassStrategy#mmAssetClass
 * AssetClassStrategy.mmAssetClass}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentClassification1#mmClassificationType
 * FinancialInstrumentClassification1.mmClassificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Derivative3#mmDerivativeClassification
 * Derivative3.mmDerivativeClassification}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.ProductClassificationCriteria1
 * ProductClassificationCriteria1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProductClassification1Choice
 * ProductClassification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AssetClassCommodity2Choice
 * AssetClassCommodity2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClassificationType32Choice
 * ClassificationType32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ClassificationType33Choice
 * ClassificationType33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ClassificationType2
 * ClassificationType2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AssetClass2 AssetClass2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeClassification1
 * DerivativeClassification1}</li>
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
	protected CFIOct2015Identifier classificationType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.ClassificationType1Choice#mmClassificationFinancialInstrument
	 * ClassificationType1Choice.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType1Choice#mmAlternateClassification
	 * ClassificationType1Choice.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType2Choice#mmClassificationFinancialInstrument
	 * ClassificationType2Choice.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType2Choice#mmAlternateClassification
	 * ClassificationType2Choice.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmClassificationType
	 * FinancialInstrumentAttributes8.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmClassificationType
	 * FinancialInstrumentAttributes20.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmClassificationType
	 * FinancialInstrumentAttributes35.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType3Choice#mmClassificationFinancialInstrument
	 * ClassificationType3Choice.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType3Choice#mmAlternateClassification
	 * ClassificationType3Choice.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmClassificationType
	 * FinancialInstrumentAttributes41.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes6#mmClassificationType
	 * FinancialInstrumentAttributes6.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes9#mmClassificationType
	 * FinancialInstrumentAttributes9.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes18#mmClassificationType
	 * FinancialInstrumentAttributes18.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes22#mmClassificationType
	 * FinancialInstrumentAttributes22.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes32#mmClassificationType
	 * FinancialInstrumentAttributes32.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes38#mmClassificationType
	 * FinancialInstrumentAttributes38.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes7#mmClassificationType
	 * FinancialInstrumentAttributes7.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes5#mmClassificationType
	 * FinancialInstrumentAttributes5.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes11#mmClassificationType
	 * FinancialInstrumentAttributes11.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes10#mmClassificationType
	 * FinancialInstrumentAttributes10.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes19#mmClassificationType
	 * FinancialInstrumentAttributes19.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes16#mmClassificationType
	 * FinancialInstrumentAttributes16.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes23#mmClassificationType
	 * FinancialInstrumentAttributes23.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes24#mmClassificationType
	 * FinancialInstrumentAttributes24.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes33#mmClassificationType
	 * FinancialInstrumentAttributes33.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes34#mmClassificationType
	 * FinancialInstrumentAttributes34.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes39#mmClassificationType
	 * FinancialInstrumentAttributes39.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes40#mmClassificationType
	 * FinancialInstrumentAttributes40.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes43#mmClassificationType
	 * FinancialInstrumentAttributes43.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes45#mmClassificationType
	 * FinancialInstrumentAttributes45.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmClassificationType
	 * FinancialInstrumentAttributes4.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmClassificationType
	 * FinancialInstrumentAttributes13.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmClassificationType
	 * FinancialInstrumentAttributes21.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmClassificationType
	 * FinancialInstrumentAttributes26.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmClassificationType
	 * FinancialInstrumentAttributes36.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmClassificationType
	 * FinancialInstrumentAttributes42.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmClassificationType
	 * FinancialInstrumentAttributes27.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmClassificationType
	 * FinancialInstrumentAttributes14.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmClassificationType
	 * FinancialInstrumentAttributes30.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmClassificationType
	 * FinancialInstrumentAttributes28.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType4Choice#mmClassificationFinancialInstrument
	 * ClassificationType4Choice.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType4Choice#mmAlternateClassification
	 * ClassificationType4Choice.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityClassificationType1Choice#mmCFI
	 * SecurityClassificationType1Choice.mmCFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityClassificationType1Choice#mmAlternateClassification
	 * SecurityClassificationType1Choice.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmClassificationType
	 * FinancialInstrumentAttributes1.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType30Choice#mmClassificationFinancialInstrument
	 * ClassificationType30Choice.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType30Choice#mmAlternateClassification
	 * ClassificationType30Choice.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmClassificationType
	 * FinancialInstrumentAttributes31.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmClassificationType
	 * FinancialInstrumentAttributes44.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription1#mmClassificationType
	 * SecurityInstrumentDescription1.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription2#mmClassificationType
	 * SecurityInstrumentDescription2.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmClassificationType
	 * FinancialInstrumentAttributes15.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmClassificationType
	 * FinancialInstrumentAttributes29.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClassificationType1#mmClassificationFinancialInstrument
	 * ClassificationType1.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClassificationType1#mmAlternateClassification
	 * ClassificationType1.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmClassificationType
	 * FinancialInstrumentAttributes2.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes48#mmClassificationType
	 * FinancialInstrumentAttributes48.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes50#mmClassificationType
	 * FinancialInstrumentAttributes50.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes49#mmClassificationType
	 * FinancialInstrumentAttributes49.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes55#mmClassificationType
	 * FinancialInstrumentAttributes55.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes57#mmClassificationType
	 * FinancialInstrumentAttributes57.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes56#mmClassificationType
	 * FinancialInstrumentAttributes56.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation4#mmType
	 * CollateralValuation4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProductClassificationCriteria1#mmClassificationFinancialInstrument
	 * ProductClassificationCriteria1.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ProductClassification1Choice#mmClassificationFinancialInstrument
	 * ProductClassification1Choice.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmClassificationType
	 * FinancialInstrumentAttributes63.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmClassificationType
	 * FinancialInstrumentAttributes64.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes66#mmClassificationType
	 * FinancialInstrumentAttributes66.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes65#mmClassificationType
	 * FinancialInstrumentAttributes65.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes67#mmClassificationType
	 * FinancialInstrumentAttributes67.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType32Choice#mmClassificationFinancialInstrument
	 * ClassificationType32Choice.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType32Choice#mmAlternateClassification
	 * ClassificationType32Choice.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType33Choice#mmClassificationFinancialInstrument
	 * ClassificationType33Choice.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ClassificationType33Choice#mmAlternateClassification
	 * ClassificationType33Choice.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes70#mmClassificationType
	 * FinancialInstrumentAttributes70.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes69#mmClassificationType
	 * FinancialInstrumentAttributes69.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes71#mmClassificationType
	 * FinancialInstrumentAttributes71.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmClassificationType
	 * FinancialInstrumentAttributes75.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmClassificationType
	 * FinancialInstrumentAttributes78.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation7#mmType
	 * CollateralValuation7.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription9#mmClassificationType
	 * SecurityInstrumentDescription9.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityInstrumentDescription11#mmClassificationType
	 * SecurityInstrumentDescription11.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClassificationType2#mmClassificationFinancialInstrument
	 * ClassificationType2.mmClassificationFinancialInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClassificationType2#mmAlternateClassification
	 * ClassificationType2.mmAlternateClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmFinancialInstrumentClassification
	 * TransparencyDataReport11.mmFinancialInstrumentClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmFinancialInstrumentClassification
	 * TransparencyDataReport10.mmFinancialInstrumentClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes79#mmClassificationType
	 * FinancialInstrumentAttributes79.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes81#mmClassificationType
	 * FinancialInstrumentAttributes81.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes80#mmClassificationType
	 * FinancialInstrumentAttributes80.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes85#mmClassificationType
	 * FinancialInstrumentAttributes85.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes84#mmClassificationType
	 * FinancialInstrumentAttributes84.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes83#mmClassificationType
	 * FinancialInstrumentAttributes83.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes91#mmClassificationType
	 * FinancialInstrumentAttributes91.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes92#mmClassificationType
	 * FinancialInstrumentAttributes92.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes95#mmClassificationType
	 * FinancialInstrumentAttributes95.mmClassificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes97#mmClassificationType
	 * FinancialInstrumentAttributes97.mmClassificationType}</li>
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
	public static final MMBusinessAttribute mmClassificationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ClassificationType1Choice.mmClassificationFinancialInstrument, ClassificationType1Choice.mmAlternateClassification, ClassificationType2Choice.mmClassificationFinancialInstrument,
					ClassificationType2Choice.mmAlternateClassification, FinancialInstrumentAttributes8.mmClassificationType, FinancialInstrumentAttributes20.mmClassificationType, FinancialInstrumentAttributes35.mmClassificationType,
					ClassificationType3Choice.mmClassificationFinancialInstrument, ClassificationType3Choice.mmAlternateClassification, FinancialInstrumentAttributes41.mmClassificationType,
					FinancialInstrumentAttributes6.mmClassificationType, FinancialInstrumentAttributes9.mmClassificationType, FinancialInstrumentAttributes18.mmClassificationType, FinancialInstrumentAttributes22.mmClassificationType,
					FinancialInstrumentAttributes32.mmClassificationType, FinancialInstrumentAttributes38.mmClassificationType, FinancialInstrumentAttributes7.mmClassificationType, FinancialInstrumentAttributes5.mmClassificationType,
					FinancialInstrumentAttributes11.mmClassificationType, FinancialInstrumentAttributes10.mmClassificationType, FinancialInstrumentAttributes19.mmClassificationType, FinancialInstrumentAttributes16.mmClassificationType,
					FinancialInstrumentAttributes23.mmClassificationType, FinancialInstrumentAttributes24.mmClassificationType, FinancialInstrumentAttributes33.mmClassificationType, FinancialInstrumentAttributes34.mmClassificationType,
					FinancialInstrumentAttributes39.mmClassificationType, FinancialInstrumentAttributes40.mmClassificationType, FinancialInstrumentAttributes43.mmClassificationType, FinancialInstrumentAttributes45.mmClassificationType,
					FinancialInstrumentAttributes4.mmClassificationType, FinancialInstrumentAttributes13.mmClassificationType, FinancialInstrumentAttributes21.mmClassificationType, FinancialInstrumentAttributes26.mmClassificationType,
					FinancialInstrumentAttributes36.mmClassificationType, FinancialInstrumentAttributes42.mmClassificationType, FinancialInstrumentAttributes27.mmClassificationType, FinancialInstrumentAttributes14.mmClassificationType,
					FinancialInstrumentAttributes30.mmClassificationType, FinancialInstrumentAttributes28.mmClassificationType, ClassificationType4Choice.mmClassificationFinancialInstrument,
					ClassificationType4Choice.mmAlternateClassification, SecurityClassificationType1Choice.mmCFI, SecurityClassificationType1Choice.mmAlternateClassification, FinancialInstrumentAttributes1.mmClassificationType,
					ClassificationType30Choice.mmClassificationFinancialInstrument, ClassificationType30Choice.mmAlternateClassification, FinancialInstrumentAttributes31.mmClassificationType,
					FinancialInstrumentAttributes44.mmClassificationType, SecurityInstrumentDescription1.mmClassificationType, SecurityInstrumentDescription2.mmClassificationType, FinancialInstrumentAttributes15.mmClassificationType,
					FinancialInstrumentAttributes29.mmClassificationType, ClassificationType1.mmClassificationFinancialInstrument, ClassificationType1.mmAlternateClassification, FinancialInstrumentAttributes2.mmClassificationType,
					FinancialInstrumentAttributes48.mmClassificationType, FinancialInstrumentAttributes50.mmClassificationType, FinancialInstrumentAttributes49.mmClassificationType, FinancialInstrumentAttributes55.mmClassificationType,
					FinancialInstrumentAttributes57.mmClassificationType, FinancialInstrumentAttributes56.mmClassificationType, CollateralValuation4.mmType, ProductClassificationCriteria1.mmClassificationFinancialInstrument,
					ProductClassification1Choice.mmClassificationFinancialInstrument, FinancialInstrumentAttributes63.mmClassificationType, FinancialInstrumentAttributes64.mmClassificationType,
					FinancialInstrumentAttributes66.mmClassificationType, FinancialInstrumentAttributes65.mmClassificationType, FinancialInstrumentAttributes67.mmClassificationType,
					ClassificationType32Choice.mmClassificationFinancialInstrument, ClassificationType32Choice.mmAlternateClassification, ClassificationType33Choice.mmClassificationFinancialInstrument,
					ClassificationType33Choice.mmAlternateClassification, FinancialInstrumentAttributes70.mmClassificationType, FinancialInstrumentAttributes69.mmClassificationType, FinancialInstrumentAttributes71.mmClassificationType,
					FinancialInstrumentAttributes75.mmClassificationType, FinancialInstrumentAttributes78.mmClassificationType, CollateralValuation7.mmType, SecurityInstrumentDescription9.mmClassificationType,
					SecurityInstrumentDescription11.mmClassificationType, ClassificationType2.mmClassificationFinancialInstrument, ClassificationType2.mmAlternateClassification, TransparencyDataReport11.mmFinancialInstrumentClassification,
					TransparencyDataReport10.mmFinancialInstrumentClassification, FinancialInstrumentAttributes79.mmClassificationType, FinancialInstrumentAttributes81.mmClassificationType,
					FinancialInstrumentAttributes80.mmClassificationType, FinancialInstrumentAttributes85.mmClassificationType, FinancialInstrumentAttributes84.mmClassificationType, FinancialInstrumentAttributes83.mmClassificationType,
					FinancialInstrumentAttributes91.mmClassificationType, FinancialInstrumentAttributes92.mmClassificationType, FinancialInstrumentAttributes95.mmClassificationType, FinancialInstrumentAttributes97.mmClassificationType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClassificationType";
			definition = "Classification type of the financial instrument, as per the ISO Classification of Financial Instrument (CFI) codification, for example, common share with voting rights, fully paid, or registered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CFIOct2015Identifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetClassification.class.getMethod("getClassificationType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Asset asset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmAssetClassification
	 * Asset.mmAssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractType5#mmContractType
	 * ContractType5.mmContractType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContractType6#mmContractType
	 * ContractType6.mmContractType}</li>
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
	 * name} = "Asset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset for which classification information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAsset = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ContractType5.mmContractType, ContractType6.mmContractType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Asset";
			definition = "Asset for which classification information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Asset.mmAssetClassification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Asset.mmObject();
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
	public static final MMBusinessAttribute mmLanguage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Language";
			definition = "Language in which the asset classification is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetClassification.class.getMethod("getLanguage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Scheme assetClassScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Scheme#mmAssetClassification
	 * Scheme.mmAssetClassification}</li>
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
	public static final MMBusinessAssociationEnd mmAssetClassScheme = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AssetClassScheme";
			definition = "Information regarding the entity that assigns the asset classification.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Scheme.mmAssetClassification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Scheme.mmObject();
		}
	};
	protected ProductTypeCode productType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ClassificationType1#mmFinancialInstrumentProductTypeCode
	 * ClassificationType1.mmFinancialInstrumentProductTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProductType1Choice#mmCode
	 * FinancialInstrumentProductType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentProductType1Choice#mmProprietary
	 * FinancialInstrumentProductType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmInstrumentType
	 * UnsecuredMarketTransaction1.mmInstrumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmInstrumentType
	 * UnsecuredMarketTransaction2.mmInstrumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmInstrumentType
	 * UnsecuredMarketTransaction3.mmInstrumentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ClassificationType2#mmFinancialInstrumentProductTypeCode
	 * ClassificationType2.mmFinancialInstrumentProductTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport10#mmDerivativeContractType
	 * TransparencyDataReport10.mmDerivativeContractType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.DebtInstrument5#mmType
	 * DebtInstrument5.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#mmBasket
	 * EquityDerivative3Choice.mmBasket}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#mmIndex
	 * EquityDerivative3Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#mmSingleName
	 * EquityDerivative3Choice.mmSingleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EquityDerivative3Choice#mmOther
	 * EquityDerivative3Choice.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmInstrumentType
	 * UnsecuredMarketTransaction4.mmInstrumentType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContractType5#mmAssetClass
	 * ContractType5.mmAssetClass}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContractType6#mmAssetClass
	 * ContractType6.mmAssetClass}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ClearedProduct1#mmProduct
	 * ClearedProduct1.mmProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeClassification1#mmBaseProduct
	 * DerivativeClassification1.mmBaseProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeClassification1#mmTransactionType
	 * DerivativeClassification1.mmTransactionType}</li>
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
	public static final MMBusinessAttribute mmProductType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ClassificationType1.mmFinancialInstrumentProductTypeCode, FinancialInstrumentProductType1Choice.mmCode, FinancialInstrumentProductType1Choice.mmProprietary,
					UnsecuredMarketTransaction1.mmInstrumentType, UnsecuredMarketTransaction2.mmInstrumentType, UnsecuredMarketTransaction3.mmInstrumentType, ClassificationType2.mmFinancialInstrumentProductTypeCode,
					TransparencyDataReport10.mmDerivativeContractType, DebtInstrument5.mmType, EquityDerivative3Choice.mmBasket, EquityDerivative3Choice.mmIndex, EquityDerivative3Choice.mmSingleName, EquityDerivative3Choice.mmOther,
					UnsecuredMarketTransaction4.mmInstrumentType, ContractType5.mmAssetClass, ContractType6.mmAssetClass, ClearedProduct1.mmProduct, DerivativeClassification1.mmBaseProduct, DerivativeClassification1.mmTransactionType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProductType";
			definition = "Identifies the product type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProductTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AssetClassification.class.getMethod("getProductType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AssetClassStrategy strategy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassStrategy#mmAssetClass
	 * AssetClassStrategy.mmAssetClass}</li>
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
	public static final MMBusinessAssociationEnd mmStrategy = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Strategy";
			definition = "Strategy related to a class of assets.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassStrategy.mmAssetClass;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetClassStrategy.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassification";
				definition = "Other classification type of the security, ie, other than ISO 10962.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.mmAssetClassification, com.tools20022.repository.entity.Scheme.mmAssetClassification,
						com.tools20022.repository.entity.AssetClassStrategy.mmAssetClass);
				derivationElement_lazy = () -> Arrays.asList(FinancialInstrumentClassification1.mmClassificationType, Derivative3.mmDerivativeClassification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AssetClassification.mmClassificationType, com.tools20022.repository.entity.AssetClassification.mmAsset,
						com.tools20022.repository.entity.AssetClassification.mmLanguage, com.tools20022.repository.entity.AssetClassification.mmAssetClassScheme, com.tools20022.repository.entity.AssetClassification.mmProductType,
						com.tools20022.repository.entity.AssetClassification.mmStrategy);
				derivationComponent_lazy = () -> Arrays.asList(ClassificationType1Choice.mmObject(), ClassificationType2Choice.mmObject(), ClassificationType3Choice.mmObject(), ClassificationType4Choice.mmObject(),
						SecurityClassificationType1Choice.mmObject(), ClassificationType30Choice.mmObject(), ClassificationType1.mmObject(), FinancialInstrumentClassification1.mmObject(), FinancialInstrumentProductType1Choice.mmObject(),
						ProductClassificationCriteria1.mmObject(), ProductClassification1Choice.mmObject(), AssetClassCommodity2Choice.mmObject(), ClassificationType32Choice.mmObject(), ClassificationType33Choice.mmObject(),
						ClassificationType2.mmObject(), AssetClass2.mmObject(), DerivativeClassification1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AssetClassification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CFIOct2015Identifier getClassificationType() {
		return classificationType;
	}

	public AssetClassification setClassificationType(CFIOct2015Identifier classificationType) {
		this.classificationType = Objects.requireNonNull(classificationType);
		return this;
	}

	public Optional<Asset> getAsset() {
		return asset == null ? Optional.empty() : Optional.of(asset);
	}

	public AssetClassification setAsset(com.tools20022.repository.entity.Asset asset) {
		this.asset = asset;
		return this;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public AssetClassification setLanguage(LanguageCode language) {
		this.language = Objects.requireNonNull(language);
		return this;
	}

	public Scheme getAssetClassScheme() {
		return assetClassScheme;
	}

	public AssetClassification setAssetClassScheme(com.tools20022.repository.entity.Scheme assetClassScheme) {
		this.assetClassScheme = Objects.requireNonNull(assetClassScheme);
		return this;
	}

	public ProductTypeCode getProductType() {
		return productType;
	}

	public AssetClassification setProductType(ProductTypeCode productType) {
		this.productType = Objects.requireNonNull(productType);
		return this;
	}

	public Optional<AssetClassStrategy> getStrategy() {
		return strategy == null ? Optional.empty() : Optional.of(strategy);
	}

	public AssetClassification setStrategy(com.tools20022.repository.entity.AssetClassStrategy strategy) {
		this.strategy = strategy;
		return this;
	}
}