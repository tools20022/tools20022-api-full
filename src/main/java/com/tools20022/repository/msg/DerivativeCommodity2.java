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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AssetClassCommodity3Choice;
import com.tools20022.repository.codeset.AssetClassTransactionType1Code;
import com.tools20022.repository.codeset.AssetPriceType1Code;
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the details of a commodity derivative.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DerivativeCommodity2#mmProduct
 * DerivativeCommodity2.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeCommodity2#mmTransactionType
 * DerivativeCommodity2.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeCommodity2#mmFinalPriceType
 * DerivativeCommodity2.mmFinalPriceType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
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
 * "DerivativeCommodity2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the details of a commodity derivative. "</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "DerivativeCommodity2", propOrder = {"product", "transactionType", "finalPriceType"})
public class DerivativeCommodity2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AssetClassCommodity3Choice product;
	/**
	 * Commodity product attributes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodity3Choice
	 * AssetClassCommodity3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeCommodity2
	 * DerivativeCommodity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Commodity product attributes."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProduct = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Commodity.mmObject();
			componentContext_lazy = () -> DerivativeCommodity2.mmObject();
			isDerived = false;
			xmlTag = "Pdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Product";
			definition = "Commodity product attributes.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AssetClassCommodity3Choice.mmObject();
		}
	};
	protected AssetClassTransactionType1Code transactionType;
	/**
	 * Transaction type as specified by the trading venue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassTransactionType1Code
	 * AssetClassTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTransactionType
	 * SecuritiesTrade.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeCommodity2
	 * DerivativeCommodity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction type as specified by the trading venue."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> DerivativeCommodity2.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Transaction type as specified by the trading venue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetClassTransactionType1Code.mmObject();
		}
	};
	protected AssetPriceType1Code finalPriceType;
	/**
	 * Final price type as specified by the trading venue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AssetPriceType1Code
	 * AssetPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeCommodity2
	 * DerivativeCommodity2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlPricTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Final price type as specified by the trading venue."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalPriceType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> DerivativeCommodity2.mmObject();
			isDerived = false;
			xmlTag = "FnlPricTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalPriceType";
			definition = "Final price type as specified by the trading venue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AssetPriceType1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(DerivativeCommodity2.mmProduct, DerivativeCommodity2.mmTransactionType, DerivativeCommodity2.mmFinalPriceType);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DerivativeCommodity2";
				definition = "Defines the details of a commodity derivative. ";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Pdct", required = true)
	public AssetClassCommodity3Choice getProduct() {
		return product;
	}

	public void setProduct(AssetClassCommodity3Choice product) {
		this.product = product;
	}

	@XmlElement(name = "TxTp")
	public AssetClassTransactionType1Code getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(AssetClassTransactionType1Code transactionType) {
		this.transactionType = transactionType;
	}

	@XmlElement(name = "FnlPricTp")
	public AssetPriceType1Code getFinalPriceType() {
		return finalPriceType;
	}

	public void setFinalPriceType(AssetPriceType1Code finalPriceType) {
		this.finalPriceType = finalPriceType;
	}
}