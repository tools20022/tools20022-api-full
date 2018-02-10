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
import com.tools20022.repository.codeset.CurrencyConversionResponse3Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Conversion between the currency of a card acceptor and the currency of a card
 * issuer, provided by a dedicated service provider.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion11#mmResult
 * CurrencyConversion11.mmResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion11#mmResultReason
 * CurrencyConversion11.mmResultReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion11#mmConversionDetails
 * CurrencyConversion11.mmConversionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
 * CurrencyExchange}</li>
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
 * "CurrencyConversion11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion7
 * CurrencyConversion7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyConversion11", propOrder = {"result", "resultReason", "conversionDetails"})
public class CurrencyConversion11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rslt", required = true)
	protected CurrencyConversionResponse3Code result;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
	 * CurrencyConversionResponse3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion11
	 * CurrencyConversion11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Result"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of a requested currency conversion."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion7#mmResult
	 * CurrencyConversion7.mmResult}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion11.mmObject();
			isDerived = false;
			xmlTag = "Rslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Result";
			definition = "Result of a requested currency conversion.";
			previousVersion_lazy = () -> CurrencyConversion7.mmResult;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyConversionResponse3Code.mmObject();
		}
	};
	@XmlElement(name = "RsltRsn")
	protected Max35Text resultReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion11
	 * CurrencyConversion11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Plain text explaining the result of the  currency conversion request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion7#mmResultReason
	 * CurrencyConversion7.mmResultReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResultReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion11.mmObject();
			isDerived = false;
			xmlTag = "RsltRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultReason";
			definition = "Plain text explaining the result of the  currency conversion request.";
			previousVersion_lazy = () -> CurrencyConversion7.mmResultReason;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ConvsDtls")
	protected List<com.tools20022.repository.msg.CurrencyConversion12> conversionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion12
	 * CurrencyConversion12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion11
	 * CurrencyConversion11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the conversion of currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion7#mmConversionDetails
	 * CurrencyConversion7.mmConversionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConversionDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyConversion11.mmObject();
			isDerived = false;
			xmlTag = "ConvsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionDetails";
			definition = "Information about the conversion of currency.";
			previousVersion_lazy = () -> CurrencyConversion7.mmConversionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyConversion12.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion11.mmResult, com.tools20022.repository.msg.CurrencyConversion11.mmResultReason,
						com.tools20022.repository.msg.CurrencyConversion11.mmConversionDetails);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversion11";
				definition = "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider.";
				previousVersion_lazy = () -> CurrencyConversion7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyConversionResponse3Code getResult() {
		return result;
	}

	public CurrencyConversion11 setResult(CurrencyConversionResponse3Code result) {
		this.result = Objects.requireNonNull(result);
		return this;
	}

	public Optional<Max35Text> getResultReason() {
		return resultReason == null ? Optional.empty() : Optional.of(resultReason);
	}

	public CurrencyConversion11 setResultReason(Max35Text resultReason) {
		this.resultReason = resultReason;
		return this;
	}

	public List<CurrencyConversion12> getConversionDetails() {
		return conversionDetails == null ? conversionDetails = new ArrayList<>() : conversionDetails;
	}

	public CurrencyConversion11 setConversionDetails(List<com.tools20022.repository.msg.CurrencyConversion12> conversionDetails) {
		this.conversionDetails = Objects.requireNonNull(conversionDetails);
		return this;
	}
}