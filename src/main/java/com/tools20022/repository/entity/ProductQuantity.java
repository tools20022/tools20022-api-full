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
import com.tools20022.repository.choice.UnitOfMeasure2Choice;
import com.tools20022.repository.choice.UnitOfMeasure3Choice;
import com.tools20022.repository.codeset.UnitOfMeasureCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the ordered quantity of a product.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProductQuantity" src="doc-files/ProductQuantity.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmUnitOfMeasure
 * ProductQuantity.mmUnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#mmValue
 * ProductQuantity.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#mmProduct
 * ProductQuantity.mmProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductQuantity#mmFactor
 * ProductQuantity.mmFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmNetWeightRelatedLineItem
 * ProductQuantity.mmNetWeightRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmBilledQuantityRelatedLineItem
 * ProductQuantity.mmBilledQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmRelatedPackaging
 * ProductQuantity.mmRelatedPackaging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForUnitQuantity
 * ProductQuantity.mmPackagingForUnitQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmChargeFreeQuantityRelatedLineItem
 * ProductQuantity.mmChargeFreeQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmMeasureQuantityStart
 * ProductQuantity.mmMeasureQuantityStart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmMeasureQuantityEnd
 * ProductQuantity.mmMeasureQuantityEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmQuantityTolerance
 * ProductQuantity.mmQuantityTolerance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForConsignmentlQuantity
 * ProductQuantity.mmPackagingForConsignmentlQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForVolume
 * ProductQuantity.mmPackagingForVolume}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmPackagingForWeight
 * ProductQuantity.mmPackagingForWeight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmGrossPriceQuantityRelatedLineItem
 * ProductQuantity.mmGrossPriceQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmNetPriceQuantityRelatedLineItem
 * ProductQuantity.mmNetPriceQuantityRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmGrossWeightRelatedLineItem
 * ProductQuantity.mmGrossWeightRelatedLineItem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmQuantity
 * Product.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tolerance#mmQuantity
 * Tolerance.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmNetWeight
 * LineItem.mmNetWeight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmBilledQuantity
 * LineItem.mmBilledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmChargeFreeQuantity
 * LineItem.mmChargeFreeQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureQuantityStartRelatedLineItem
 * LineItem.mmMeasureQuantityStartRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureQuantityEndRelatedLineItem
 * LineItem.mmMeasureQuantityEndRelatedLineItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LineItem#mmGrossPriceQuantity
 * LineItem.mmGrossPriceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmNetPriceQuantity
 * LineItem.mmNetPriceQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmGrossWeight
 * LineItem.mmGrossWeight}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmQuantity
 * Packaging.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Packaging#mmPerPackageUnitQuantity
 * Packaging.mmPerPackageUnitQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalConsignmentQuantity
 * Packaging.mmTotalConsignmentQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmTotalVolume
 * Packaging.mmTotalVolume}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#mmTotalWeight
 * Packaging.mmTotalWeight}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity3 Quantity3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity4 Quantity4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity2 Quantity2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnitOfMeasure2Choice
 * UnitOfMeasure2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity10 Quantity10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnitOfMeasure3Choice
 * UnitOfMeasure3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Quantity9 Quantity9}</li>
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
 * "ProductQuantity"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the ordered quantity of a product."</li>
 * </ul>
 */
public class ProductQuantity {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected UnitOfMeasureCode unitOfMeasure;
	/**
	 * Specifies the unit of measurement. For example, kilo, tons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product2#mmUnitOfMeasure
	 * Product2.mmUnitOfMeasure}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product1#mmUnitOfMeasure
	 * Product1.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity3#mmUnitOfMeasureCode
	 * Quantity3.mmUnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity3#mmOtherUnitOfMeasure
	 * Quantity3.mmOtherUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity4#mmUnitOfMeasureCode
	 * Quantity4.mmUnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity4#mmOtherUnitOfMeasure
	 * Quantity4.mmOtherUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity2#mmUnitOfMeasureCode
	 * Quantity2.mmUnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Quantity2#mmOtherUnitOfMeasure
	 * Quantity2.mmOtherUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOfMeasure2Choice#mmCode
	 * UnitOfMeasure2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOfMeasure2Choice#mmProprietary
	 * UnitOfMeasure2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quantity10#mmUnitOfMeasure
	 * Quantity10.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOfMeasure3Choice#mmUnitOfMeasureCode
	 * UnitOfMeasure3Choice.mmUnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitOfMeasure3Choice#mmOtherUnitOfMeasure
	 * UnitOfMeasure3Choice.mmOtherUnitOfMeasure}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quantity9#mmUnitOfMeasure
	 * Quantity9.mmUnitOfMeasure}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmUnitOfMeasure
	 * Product3.mmUnitOfMeasure}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product5#mmUnitOfMeasure
	 * Product5.mmUnitOfMeasure}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the unit of measurement. For example, kilo, tons."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnitOfMeasure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Product2.mmUnitOfMeasure, com.tools20022.repository.msg.Product1.mmUnitOfMeasure, com.tools20022.repository.msg.Quantity3.mmUnitOfMeasureCode,
					com.tools20022.repository.msg.Quantity3.mmOtherUnitOfMeasure, com.tools20022.repository.msg.Quantity4.mmUnitOfMeasureCode, com.tools20022.repository.msg.Quantity4.mmOtherUnitOfMeasure,
					com.tools20022.repository.msg.Quantity2.mmUnitOfMeasureCode, com.tools20022.repository.msg.Quantity2.mmOtherUnitOfMeasure, com.tools20022.repository.choice.UnitOfMeasure2Choice.mmCode,
					com.tools20022.repository.choice.UnitOfMeasure2Choice.mmProprietary, com.tools20022.repository.msg.Quantity10.mmUnitOfMeasure, com.tools20022.repository.choice.UnitOfMeasure3Choice.mmUnitOfMeasureCode,
					com.tools20022.repository.choice.UnitOfMeasure3Choice.mmOtherUnitOfMeasure, com.tools20022.repository.msg.Quantity9.mmUnitOfMeasure, com.tools20022.repository.msg.Product3.mmUnitOfMeasure,
					com.tools20022.repository.msg.Product5.mmUnitOfMeasure);
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitOfMeasure";
			definition = "Specifies the unit of measurement. For example, kilo, tons.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnitOfMeasureCode.mmObject();
		}
	};
	protected DecimalNumber value;
	/**
	 * Quantity of a product on a line specified by a number. For example, 100
	 * (kgs), 50 (pieces).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product2#mmProductQuantity
	 * Product2.mmProductQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product1#mmProductQuantity
	 * Product1.mmProductQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quantity3#mmValue
	 * Quantity3.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quantity4#mmValue
	 * Quantity4.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters1#mmVolume
	 * BillingServiceParameters1.mmVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters2#mmVolume
	 * BillingServiceParameters2.mmVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmVolumeChange
	 * BillingServiceAdjustment1.mmVolumeChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmOriginalVolume
	 * BillingServiceAdjustment1.mmOriginalVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmNewVolume
	 * BillingServiceAdjustment1.mmNewVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1#mmQuantity
	 * ServiceItemTotals1.mmQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quantity10#mmValue
	 * Quantity10.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quantity9#mmValue
	 * Quantity9.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceParameters3#mmVolume
	 * BillingServiceParameters3.mmVolume}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmProductQuantity
	 * Product3.mmProductQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product5#mmQuantityLimit
	 * Product5.mmQuantityLimit}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of a product on a line specified by a number. For example, 100 (kgs), 50 (pieces)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Product2.mmProductQuantity, com.tools20022.repository.msg.Product1.mmProductQuantity, com.tools20022.repository.msg.Quantity3.mmValue,
					com.tools20022.repository.msg.Quantity4.mmValue, com.tools20022.repository.msg.BillingServiceParameters1.mmVolume, com.tools20022.repository.msg.BillingServiceParameters2.mmVolume,
					com.tools20022.repository.msg.BillingServiceAdjustment1.mmVolumeChange, com.tools20022.repository.msg.BillingServiceAdjustment1.mmOriginalVolume, com.tools20022.repository.msg.BillingServiceAdjustment1.mmNewVolume,
					com.tools20022.repository.msg.ServiceItemTotals1.mmQuantity, com.tools20022.repository.msg.Quantity10.mmValue, com.tools20022.repository.msg.Quantity9.mmValue,
					com.tools20022.repository.msg.BillingServiceParameters3.mmVolume, com.tools20022.repository.msg.Product3.mmProductQuantity, com.tools20022.repository.msg.Product5.mmQuantityLimit);
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Quantity of a product on a line specified by a number. For example, 100 (kgs), 50 (pieces).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Product> product;
	/**
	 * Specifies the type of goods and services linked to the quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of goods and services linked to the quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the type of goods and services linked to the quantity.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected Max15NumericText factor;
	/**
	 * Multiplication factor of measurement values. For example: goods that can
	 * be ordered by 36 pieces.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Quantity4#mmFactor
	 * Quantity4.mmFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quantity2#mmFactor
	 * Quantity2.mmFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice8#mmFactor
	 * UnitPrice8.mmFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice9#mmFactor
	 * UnitPrice9.mmFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Quantity9#mmFactor
	 * Quantity9.mmFactor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice18#mmFactor
	 * UnitPrice18.mmFactor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Factor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multiplication factor of measurement values. For example: goods that can be ordered by 36 pieces."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFactor = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Quantity4.mmFactor, com.tools20022.repository.msg.Quantity2.mmFactor, com.tools20022.repository.msg.UnitPrice8.mmFactor,
					com.tools20022.repository.msg.UnitPrice9.mmFactor, com.tools20022.repository.msg.Quantity9.mmFactor, com.tools20022.repository.msg.UnitPrice18.mmFactor);
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Multiplication factor of measurement values. For example: goods that can be ordered by 36 pieces.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected LineItem netWeightRelatedLineItem;
	/**
	 * Line item for which a net weight is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmNetWeight
	 * LineItem.mmNetWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetWeightRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which a net weight is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetWeightRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetWeightRelatedLineItem";
			definition = "Line item for which a net weight is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmNetWeight;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected LineItem billedQuantityRelatedLineItem;
	/**
	 * Line item which contains this quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmBilledQuantity
	 * LineItem.mmBilledQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilledQuantityRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item which contains this quantity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmBilledQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BilledQuantityRelatedLineItem";
			definition = "Line item which contains this quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmBilledQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected Packaging relatedPackaging;
	/**
	 * Packaging for which a quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmQuantity
	 * Packaging.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPackaging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Packaging for which a quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPackaging = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPackaging";
			definition = "Packaging for which a quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected Packaging packagingForUnitQuantity;
	/**
	 * Packaging for which a unit quantity per package is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmPerPackageUnitQuantity
	 * Packaging.mmPerPackageUnitQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackagingForUnitQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Packaging for which a unit quantity per package is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPackagingForUnitQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingForUnitQuantity";
			definition = "Packaging for which a unit quantity per package is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmPerPackageUnitQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected LineItem chargeFreeQuantityRelatedLineItem;
	/**
	 * Line item for which a charge free quantity of product is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmChargeFreeQuantity
	 * LineItem.mmChargeFreeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeFreeQuantityRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Line item for which a charge free quantity of product is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmChargeFreeQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChargeFreeQuantityRelatedLineItem";
			definition = "Line item for which a charge free quantity of product is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmChargeFreeQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected LineItem measureQuantityStart;
	/**
	 * Quantity value on which the quantity measurement started for a line item.
	 * For instance the start amount of a meter reading for an electricity
	 * supplier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureQuantityStartRelatedLineItem
	 * LineItem.mmMeasureQuantityStartRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmMeasureQuantityStart
	 * LineItem10.mmMeasureQuantityStart}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmMeasureQuantityStart
	 * LineItem16.mmMeasureQuantityStart}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureQuantityStart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity value on which the quantity measurement started for a line item. For instance the start amount of a meter reading for an electricity supplier."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeasureQuantityStart = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.mmMeasureQuantityStart, com.tools20022.repository.msg.LineItem16.mmMeasureQuantityStart);
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeasureQuantityStart";
			definition = "Quantity value on which the quantity measurement started for a line item. For instance the start amount of a meter reading for an electricity supplier.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmMeasureQuantityStartRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected LineItem measureQuantityEnd;
	/**
	 * Quantity value on which the quantity measurement ended for a line item.
	 * For instance the end amount of a meter reading for an electricity
	 * supplier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmMeasureQuantityEndRelatedLineItem
	 * LineItem.mmMeasureQuantityEndRelatedLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmMeasureQuantityEnd
	 * LineItem10.mmMeasureQuantityEnd}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmMeasureQuantityEnd
	 * LineItem16.mmMeasureQuantityEnd}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeasureQuantityEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity value on which the quantity measurement ended for a line item. For instance the end amount of a meter reading for an electricity supplier."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeasureQuantityEnd = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.mmMeasureQuantityEnd, com.tools20022.repository.msg.LineItem16.mmMeasureQuantityEnd);
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MeasureQuantityEnd";
			definition = "Quantity value on which the quantity measurement ended for a line item. For instance the end amount of a meter reading for an electricity supplier.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmMeasureQuantityEndRelatedLineItem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected Tolerance quantityTolerance;
	/**
	 * Variance allowed in the quantity of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tolerance#mmQuantity
	 * Tolerance.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tolerance Tolerance}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmQuantityTolerance
	 * LineItemDetails4.mmQuantityTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmQuantityTolerance
	 * LineItemDetails7.mmQuantityTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmQuantityTolerance
	 * LineItemDetails5.mmQuantityTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmQuantityTolerance
	 * LineItemDetails8.mmQuantityTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmQuantityTolerance
	 * LineItemDetails10.mmQuantityTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmQuantityTolerance
	 * LineItemDetails13.mmQuantityTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmQuantityTolerance
	 * LineItemDetails12.mmQuantityTolerance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityTolerance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance allowed in the quantity of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuantityTolerance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemDetails4.mmQuantityTolerance, com.tools20022.repository.msg.LineItemDetails7.mmQuantityTolerance,
					com.tools20022.repository.msg.LineItemDetails5.mmQuantityTolerance, com.tools20022.repository.msg.LineItemDetails8.mmQuantityTolerance, com.tools20022.repository.msg.LineItemDetails10.mmQuantityTolerance,
					com.tools20022.repository.msg.LineItemDetails13.mmQuantityTolerance, com.tools20022.repository.msg.LineItemDetails12.mmQuantityTolerance);
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuantityTolerance";
			definition = "Variance allowed in the quantity of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tolerance.mmQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tolerance.mmObject();
		}
	};
	protected Packaging packagingForConsignmentlQuantity;
	/**
	 * Packaging for which a total consignment quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalConsignmentQuantity
	 * Packaging.mmTotalConsignmentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackagingForConsignmentlQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Packaging for which a total consignment quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPackagingForConsignmentlQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingForConsignmentlQuantity";
			definition = "Packaging for which a total consignment quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmTotalConsignmentQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected Packaging packagingForVolume;
	/**
	 * Packaging for which a volume is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalVolume
	 * Packaging.mmTotalVolume}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackagingForVolume"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Packaging for which a volume is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPackagingForVolume = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingForVolume";
			definition = "Packaging for which a volume is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmTotalVolume;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected Packaging packagingForWeight;
	/**
	 * Packaging for which a weight is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#mmTotalWeight
	 * Packaging.mmTotalWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackagingForWeight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Packaging for which a weight is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPackagingForWeight = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PackagingForWeight";
			definition = "Packaging for which a weight is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.mmTotalWeight;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
		}
	};
	protected LineItem grossPriceQuantityRelatedLineItem;
	/**
	 * Line item for which gross price quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmGrossPriceQuantity
	 * LineItem.mmGrossPriceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossPriceQuantityRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which gross price quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGrossPriceQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossPriceQuantityRelatedLineItem";
			definition = "Line item for which gross price quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmGrossPriceQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected LineItem netPriceQuantityRelatedLineItem;
	/**
	 * Line item for which a net price quantity is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmNetPriceQuantity
	 * LineItem.mmNetPriceQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceQuantityRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which a net price quantity is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetPriceQuantityRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPriceQuantityRelatedLineItem";
			definition = "Line item for which a net price quantity is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmNetPriceQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected LineItem grossWeightRelatedLineItem;
	/**
	 * Line item for which a gross weight is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmGrossWeight
	 * LineItem.mmGrossWeight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity
	 * ProductQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossWeightRelatedLineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Line item for which a gross weight is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGrossWeightRelatedLineItem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProductQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossWeightRelatedLineItem";
			definition = "Line item for which a gross weight is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmGrossWeight;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProductQuantity";
				definition = "Specifies the ordered quantity of a product.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Product.mmQuantity, com.tools20022.repository.entity.Tolerance.mmQuantity, com.tools20022.repository.entity.LineItem.mmNetWeight,
						com.tools20022.repository.entity.LineItem.mmBilledQuantity, com.tools20022.repository.entity.LineItem.mmChargeFreeQuantity, com.tools20022.repository.entity.LineItem.mmMeasureQuantityStartRelatedLineItem,
						com.tools20022.repository.entity.LineItem.mmMeasureQuantityEndRelatedLineItem, com.tools20022.repository.entity.LineItem.mmGrossPriceQuantity, com.tools20022.repository.entity.LineItem.mmNetPriceQuantity,
						com.tools20022.repository.entity.LineItem.mmGrossWeight, com.tools20022.repository.entity.Packaging.mmQuantity, com.tools20022.repository.entity.Packaging.mmPerPackageUnitQuantity,
						com.tools20022.repository.entity.Packaging.mmTotalConsignmentQuantity, com.tools20022.repository.entity.Packaging.mmTotalVolume, com.tools20022.repository.entity.Packaging.mmTotalWeight);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductQuantity.mmUnitOfMeasure, com.tools20022.repository.entity.ProductQuantity.mmValue, com.tools20022.repository.entity.ProductQuantity.mmProduct,
						com.tools20022.repository.entity.ProductQuantity.mmFactor, com.tools20022.repository.entity.ProductQuantity.mmNetWeightRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.mmBilledQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.mmRelatedPackaging,
						com.tools20022.repository.entity.ProductQuantity.mmPackagingForUnitQuantity, com.tools20022.repository.entity.ProductQuantity.mmChargeFreeQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.mmMeasureQuantityStart, com.tools20022.repository.entity.ProductQuantity.mmMeasureQuantityEnd, com.tools20022.repository.entity.ProductQuantity.mmQuantityTolerance,
						com.tools20022.repository.entity.ProductQuantity.mmPackagingForConsignmentlQuantity, com.tools20022.repository.entity.ProductQuantity.mmPackagingForVolume,
						com.tools20022.repository.entity.ProductQuantity.mmPackagingForWeight, com.tools20022.repository.entity.ProductQuantity.mmGrossPriceQuantityRelatedLineItem,
						com.tools20022.repository.entity.ProductQuantity.mmNetPriceQuantityRelatedLineItem, com.tools20022.repository.entity.ProductQuantity.mmGrossWeightRelatedLineItem);
				derivationComponent_lazy = () -> Arrays.asList(Quantity3.mmObject(), Quantity4.mmObject(), Quantity2.mmObject(), UnitOfMeasure2Choice.mmObject(), Quantity10.mmObject(), UnitOfMeasure3Choice.mmObject(), Quantity9.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public UnitOfMeasureCode getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(UnitOfMeasureCode unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public DecimalNumber getValue() {
		return value;
	}

	public void setValue(DecimalNumber value) {
		this.value = value;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<com.tools20022.repository.entity.Product> product) {
		this.product = product;
	}

	public Max15NumericText getFactor() {
		return factor;
	}

	public void setFactor(Max15NumericText factor) {
		this.factor = factor;
	}

	public LineItem getNetWeightRelatedLineItem() {
		return netWeightRelatedLineItem;
	}

	public void setNetWeightRelatedLineItem(com.tools20022.repository.entity.LineItem netWeightRelatedLineItem) {
		this.netWeightRelatedLineItem = netWeightRelatedLineItem;
	}

	public LineItem getBilledQuantityRelatedLineItem() {
		return billedQuantityRelatedLineItem;
	}

	public void setBilledQuantityRelatedLineItem(com.tools20022.repository.entity.LineItem billedQuantityRelatedLineItem) {
		this.billedQuantityRelatedLineItem = billedQuantityRelatedLineItem;
	}

	public Packaging getRelatedPackaging() {
		return relatedPackaging;
	}

	public void setRelatedPackaging(com.tools20022.repository.entity.Packaging relatedPackaging) {
		this.relatedPackaging = relatedPackaging;
	}

	public Packaging getPackagingForUnitQuantity() {
		return packagingForUnitQuantity;
	}

	public void setPackagingForUnitQuantity(com.tools20022.repository.entity.Packaging packagingForUnitQuantity) {
		this.packagingForUnitQuantity = packagingForUnitQuantity;
	}

	public LineItem getChargeFreeQuantityRelatedLineItem() {
		return chargeFreeQuantityRelatedLineItem;
	}

	public void setChargeFreeQuantityRelatedLineItem(com.tools20022.repository.entity.LineItem chargeFreeQuantityRelatedLineItem) {
		this.chargeFreeQuantityRelatedLineItem = chargeFreeQuantityRelatedLineItem;
	}

	public LineItem getMeasureQuantityStart() {
		return measureQuantityStart;
	}

	public void setMeasureQuantityStart(com.tools20022.repository.entity.LineItem measureQuantityStart) {
		this.measureQuantityStart = measureQuantityStart;
	}

	public LineItem getMeasureQuantityEnd() {
		return measureQuantityEnd;
	}

	public void setMeasureQuantityEnd(com.tools20022.repository.entity.LineItem measureQuantityEnd) {
		this.measureQuantityEnd = measureQuantityEnd;
	}

	public Tolerance getQuantityTolerance() {
		return quantityTolerance;
	}

	public void setQuantityTolerance(com.tools20022.repository.entity.Tolerance quantityTolerance) {
		this.quantityTolerance = quantityTolerance;
	}

	public Packaging getPackagingForConsignmentlQuantity() {
		return packagingForConsignmentlQuantity;
	}

	public void setPackagingForConsignmentlQuantity(com.tools20022.repository.entity.Packaging packagingForConsignmentlQuantity) {
		this.packagingForConsignmentlQuantity = packagingForConsignmentlQuantity;
	}

	public Packaging getPackagingForVolume() {
		return packagingForVolume;
	}

	public void setPackagingForVolume(com.tools20022.repository.entity.Packaging packagingForVolume) {
		this.packagingForVolume = packagingForVolume;
	}

	public Packaging getPackagingForWeight() {
		return packagingForWeight;
	}

	public void setPackagingForWeight(com.tools20022.repository.entity.Packaging packagingForWeight) {
		this.packagingForWeight = packagingForWeight;
	}

	public LineItem getGrossPriceQuantityRelatedLineItem() {
		return grossPriceQuantityRelatedLineItem;
	}

	public void setGrossPriceQuantityRelatedLineItem(com.tools20022.repository.entity.LineItem grossPriceQuantityRelatedLineItem) {
		this.grossPriceQuantityRelatedLineItem = grossPriceQuantityRelatedLineItem;
	}

	public LineItem getNetPriceQuantityRelatedLineItem() {
		return netPriceQuantityRelatedLineItem;
	}

	public void setNetPriceQuantityRelatedLineItem(com.tools20022.repository.entity.LineItem netPriceQuantityRelatedLineItem) {
		this.netPriceQuantityRelatedLineItem = netPriceQuantityRelatedLineItem;
	}

	public LineItem getGrossWeightRelatedLineItem() {
		return grossWeightRelatedLineItem;
	}

	public void setGrossWeightRelatedLineItem(com.tools20022.repository.entity.LineItem grossWeightRelatedLineItem) {
		this.grossWeightRelatedLineItem = grossWeightRelatedLineItem;
	}
}