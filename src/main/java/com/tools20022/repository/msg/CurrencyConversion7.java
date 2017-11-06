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
import com.tools20022.repository.codeset.CurrencyConversionResponse1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CurrencyExchange;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion7#mmResult
 * CurrencyConversion7.mmResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion7#mmResultReason
 * CurrencyConversion7.mmResultReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion7#mmConversionDetails
 * CurrencyConversion7.mmConversionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
 * CurrencyExchange}</li>
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
 * "CurrencyConversion7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion11
 * CurrencyConversion11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CurrencyConversion3
 * CurrencyConversion3}</li>
 * </ul>
 */
public class CurrencyConversion7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyConversionResponse1Code result;
	/**
	 * Result of a requested currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
	 * CurrencyConversionResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion7
	 * CurrencyConversion7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion11#mmResult
	 * CurrencyConversion11.mmResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion3#mmResult
	 * CurrencyConversion3.mmResult}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion7.mmObject();
			isDerived = false;
			xmlTag = "Rslt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Result";
			definition = "Result of a requested currency conversion.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion11.mmResult);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CurrencyConversion3.mmResult;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyConversionResponse1Code.mmObject();
		}
	};
	protected Max35Text resultReason;
	/**
	 * Plain text explaining the result of the currency conversion request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion7
	 * CurrencyConversion7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion11#mmResultReason
	 * CurrencyConversion11.mmResultReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion3#mmResultReason
	 * CurrencyConversion3.mmResultReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResultReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CurrencyConversion7.mmObject();
			isDerived = false;
			xmlTag = "RsltRsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultReason";
			definition = "Plain text explaining the result of the  currency conversion request.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion11.mmResultReason);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CurrencyConversion3.mmResultReason;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CurrencyConversion6 conversionDetails;
	/**
	 * Information about the conversion of currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion6
	 * CurrencyConversion6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion7
	 * CurrencyConversion7}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion11#mmConversionDetails
	 * CurrencyConversion11.mmConversionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion3#mmConversion
	 * CurrencyConversion3.mmConversion}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConversionDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CurrencyConversion7.mmObject();
			isDerived = false;
			xmlTag = "ConvsDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionDetails";
			definition = "Information about the conversion of currency.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion11.mmConversionDetails);
			previousVersion_lazy = () -> com.tools20022.repository.msg.CurrencyConversion3.mmConversion;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyConversion6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyConversion7.mmResult, com.tools20022.repository.msg.CurrencyConversion7.mmResultReason,
						com.tools20022.repository.msg.CurrencyConversion7.mmConversionDetails);
				trace_lazy = () -> CurrencyExchange.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversion7";
				definition = "Conversion between the currency of a card acceptor and the currency of a card issuer, provided by a dedicated service provider.";
				nextVersions_lazy = () -> Arrays.asList(CurrencyConversion11.mmObject());
				previousVersion_lazy = () -> CurrencyConversion3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyConversionResponse1Code getResult() {
		return result;
	}

	public void setResult(CurrencyConversionResponse1Code result) {
		this.result = result;
	}

	public Max35Text getResultReason() {
		return resultReason;
	}

	public void setResultReason(Max35Text resultReason) {
		this.resultReason = resultReason;
	}

	public CurrencyConversion6 getConversionDetails() {
		return conversionDetails;
	}

	public void setConversionDetails(com.tools20022.repository.msg.CurrencyConversion6 conversionDetails) {
		this.conversionDetails = conversionDetails;
	}
}