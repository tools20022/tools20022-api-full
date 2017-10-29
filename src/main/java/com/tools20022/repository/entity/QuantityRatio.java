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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.msg.LongQuantityToQuantityRatio2;
import com.tools20022.repository.msg.QuantityToQuantityRatio1;
import com.tools20022.repository.msg.QuantityToQuantityRatio2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Ratio expressed as a quotient of quantities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="QuantityRatio" src="doc-files/QuantityRatio.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#AdditionalQuantityForResultantSecuritiesProceedsDefinition
 * QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuantityRatio#Quantity1
 * QuantityRatio.Quantity1}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuantityRatio#Quantity2
 * QuantityRatio.Quantity2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#AdditionalQuantityForSubscribedSecuritiesProceedsDefinition
 * QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#NewToOldProceedsDefinition
 * QuantityRatio.NewToOldProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#NewToUnderlyingProceedsDefinition
 * QuantityRatio.NewToUnderlyingProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.QuantityRatio#IntermediateSecuritiesProceedsDefinition
 * QuantityRatio.IntermediateSecuritiesProceedsDefinition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.QuantityRatio#warrant
 * QuantityRatio.warrant}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#WarrantParity
 * Warrant.WarrantParity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#AdditionalQuantityForSubscribedResultantSecurities
 * SecuritiesProceedsDefinition.
 * AdditionalQuantityForSubscribedResultantSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#AdditionalQuantityForExistingSecurities
 * SecuritiesProceedsDefinition.AdditionalQuantityForExistingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewToOld
 * SecuritiesProceedsDefinition.NewToOld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewSecuritiesToUnderlyingSecurities
 * SecuritiesProceedsDefinition.NewSecuritiesToUnderlyingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#IntermediateSecuritiesToUnderlyingRatio
 * SecuritiesProceedsDefinition.IntermediateSecuritiesToUnderlyingRatio}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat3Choice#QuantityToQuantity
 * RatioFormat3Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat4Choice#QuantityToQuantity
 * RatioFormat4Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat7Choice#QuantityToQuantity
 * RatioFormat7Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat8Choice#QuantityToQuantity
 * RatioFormat8Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice#QuantityToQuantity
 * RatioFormat15Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat16Choice#QuantityToQuantity
 * RatioFormat16Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat5Choice#QuantityToQuantity
 * RatioFormat5Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat6Choice#QuantityToQuantity
 * RatioFormat6Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat9Choice#QuantityToQuantity
 * RatioFormat9Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat10Choice#QuantityToQuantity
 * RatioFormat10Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat11Choice#QuantityToQuantity
 * RatioFormat11Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat12Choice#QuantityToQuantity
 * RatioFormat12Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat13Choice#QuantityToQuantity
 * RatioFormat13Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat14Choice#QuantityToQuantity
 * RatioFormat14Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#QuantityToQuantity
 * RatioFormat2Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat1Choice#QuantityToQuantity
 * RatioFormat1Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat19Choice#QuantityToQuantity
 * RatioFormat19Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat17Choice#QuantityToQuantity
 * RatioFormat17Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat18Choice#QuantityToQuantity
 * RatioFormat18Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat20Choice#QuantityToQuantity
 * RatioFormat20Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat22Choice#QuantityToQuantity
 * RatioFormat22Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#QuantityToQuantity
 * RatioFormat24Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat23Choice#QuantityToQuantity
 * RatioFormat23Choice.QuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat21Choice#QuantityToQuantity
 * RatioFormat21Choice.QuantityToQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio1
 * QuantityToQuantityRatio1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio2
 * QuantityToQuantityRatio2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LongQuantityToQuantityRatio2
 * LongQuantityToQuantityRatio2}</li>
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
 * "QuantityRatio"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Ratio expressed as a quotient of quantities."</li>
 * </ul>
 */
public class QuantityRatio {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities proceeds for which an additional quantity for subscribed
	 * resultant securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#AdditionalQuantityForSubscribedResultantSecurities
	 * SecuritiesProceedsDefinition.
	 * AdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForResultantSecuritiesProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which an additional quantity for subscribed resultant securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AdditionalQuantityForResultantSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> QuantityRatio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForResultantSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an additional quantity for subscribed resultant securities is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForSubscribedResultantSecurities;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Numerator of the quotient of quantities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio1#Quantity1
	 * QuantityToQuantityRatio1.Quantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio2#Quantity1
	 * QuantityToQuantityRatio2.Quantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongQuantityToQuantityRatio2#LongQuantity1
	 * LongQuantityToQuantityRatio2.LongQuantity1}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Numerator of the quotient of quantities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Quantity1 = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityToQuantityRatio1.Quantity1, com.tools20022.repository.msg.QuantityToQuantityRatio2.Quantity1,
					com.tools20022.repository.msg.LongQuantityToQuantityRatio2.LongQuantity1);
			elementContext_lazy = () -> QuantityRatio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity1";
			definition = "Numerator of the quotient of quantities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Denominator of the quotient of quantities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio1#Quantity2
	 * QuantityToQuantityRatio1.Quantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio2#Quantity2
	 * QuantityToQuantityRatio2.Quantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LongQuantityToQuantityRatio2#LongQuantity2
	 * LongQuantityToQuantityRatio2.LongQuantity2}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denominator of the quotient of quantities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Quantity2 = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityToQuantityRatio1.Quantity2, com.tools20022.repository.msg.QuantityToQuantityRatio2.Quantity2,
					com.tools20022.repository.msg.LongQuantityToQuantityRatio2.LongQuantity2);
			elementContext_lazy = () -> QuantityRatio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity2";
			definition = "Denominator of the quotient of quantities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Securities proceeds for which an additional quantity for existing
	 * securities is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#AdditionalQuantityForExistingSecurities
	 * SecuritiesProceedsDefinition.AdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForSubscribedSecuritiesProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which an additional quantity for existing securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AdditionalQuantityForSubscribedSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> QuantityRatio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalQuantityForSubscribedSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which an additional quantity for existing securities is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForExistingSecurities;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities procceds for which a nwe to old ratio is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewToOld
	 * SecuritiesProceedsDefinition.NewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewToOldProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities procceds for which a nwe to old ratio is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NewToOldProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> QuantityRatio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewToOldProceedsDefinition";
			definition = "Securities procceds for which a nwe to old ratio is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewToOld;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds for which a new to underlying ratio is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#NewSecuritiesToUnderlyingSecurities
	 * SecuritiesProceedsDefinition.NewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewToUnderlyingProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a new to underlying ratio is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NewToUnderlyingProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> QuantityRatio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NewToUnderlyingProceedsDefinition";
			definition = "Securities proceeds for which a new to underlying ratio is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewSecuritiesToUnderlyingSecurities;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities proceeds for which a quantity of intermediate securities is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#IntermediateSecuritiesToUnderlyingRatio
	 * SecuritiesProceedsDefinition.IntermediateSecuritiesToUnderlyingRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
	 * SecuritiesProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesProceedsDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities proceeds for which a quantity of intermediate securities is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IntermediateSecuritiesProceedsDefinition = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> QuantityRatio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IntermediateSecuritiesProceedsDefinition";
			definition = "Securities proceeds for which a quantity of intermediate securities is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesProceedsDefinition.IntermediateSecuritiesToUnderlyingRatio;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides the warrant for the related quantity or the underlying quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#WarrantParity
	 * Warrant.WarrantParity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "warrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the warrant for the related quantity or the underlying quantity. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd warrant = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> QuantityRatio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "warrant";
			definition = "Provides the warrant for the related quantity or the underlying quantity. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Warrant.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Warrant.WarrantParity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "QuantityRatio";
				definition = "Ratio expressed as a quotient of quantities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Warrant.WarrantParity, com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForSubscribedResultantSecurities,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.AdditionalQuantityForExistingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewToOld,
						com.tools20022.repository.entity.SecuritiesProceedsDefinition.NewSecuritiesToUnderlyingSecurities, com.tools20022.repository.entity.SecuritiesProceedsDefinition.IntermediateSecuritiesToUnderlyingRatio);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RatioFormat3Choice.QuantityToQuantity, com.tools20022.repository.choice.RatioFormat4Choice.QuantityToQuantity,
						com.tools20022.repository.choice.RatioFormat7Choice.QuantityToQuantity, com.tools20022.repository.choice.RatioFormat8Choice.QuantityToQuantity,
						com.tools20022.repository.choice.RatioFormat15Choice.QuantityToQuantity, com.tools20022.repository.choice.RatioFormat16Choice.QuantityToQuantity,
						com.tools20022.repository.choice.RatioFormat5Choice.QuantityToQuantity, com.tools20022.repository.choice.RatioFormat6Choice.QuantityToQuantity, com.tools20022.repository.choice.RatioFormat9Choice.QuantityToQuantity,
						com.tools20022.repository.choice.RatioFormat10Choice.QuantityToQuantity, com.tools20022.repository.choice.RatioFormat11Choice.QuantityToQuantity,
						com.tools20022.repository.choice.RatioFormat12Choice.QuantityToQuantity, com.tools20022.repository.choice.RatioFormat13Choice.QuantityToQuantity,
						com.tools20022.repository.choice.RatioFormat14Choice.QuantityToQuantity, com.tools20022.repository.choice.RatioFormat2Choice.QuantityToQuantity,
						com.tools20022.repository.choice.RatioFormat1Choice.QuantityToQuantity, com.tools20022.repository.choice.RatioFormat19Choice.QuantityToQuantity,
						com.tools20022.repository.choice.RatioFormat17Choice.QuantityToQuantity, com.tools20022.repository.choice.RatioFormat18Choice.QuantityToQuantity,
						com.tools20022.repository.choice.RatioFormat20Choice.QuantityToQuantity, com.tools20022.repository.choice.RatioFormat22Choice.QuantityToQuantity,
						com.tools20022.repository.choice.RatioFormat24Choice.QuantityToQuantity, com.tools20022.repository.choice.RatioFormat23Choice.QuantityToQuantity,
						com.tools20022.repository.choice.RatioFormat21Choice.QuantityToQuantity);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForResultantSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.Quantity1,
						com.tools20022.repository.entity.QuantityRatio.Quantity2, com.tools20022.repository.entity.QuantityRatio.AdditionalQuantityForSubscribedSecuritiesProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.NewToOldProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.NewToUnderlyingProceedsDefinition,
						com.tools20022.repository.entity.QuantityRatio.IntermediateSecuritiesProceedsDefinition, com.tools20022.repository.entity.QuantityRatio.warrant);
				derivationComponent_lazy = () -> Arrays.asList(QuantityToQuantityRatio1.mmObject(), QuantityToQuantityRatio2.mmObject(), LongQuantityToQuantityRatio2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}