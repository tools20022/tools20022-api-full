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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding corporate action options date
 * details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmPlaceAndName
 * CorporateActionDateSD7.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmActualEarlyExpirationDate
 * CorporateActionDateSD7.mmActualEarlyExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmActualProtectExpirationDate
 * CorporateActionDateSD7.mmActualProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmActualEarlyProtectExpirationDate
 * CorporateActionDateSD7.mmActualEarlyProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmDTCEarlyProtectExpirationDate
 * CorporateActionDateSD7.mmDTCEarlyProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmActualEarlyCoverProtectExpirationDate
 * CorporateActionDateSD7.mmActualEarlyCoverProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmDTCEarlyCoverProtectExpirationDate
 * CorporateActionDateSD7.mmDTCEarlyCoverProtectExpirationDate}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionDateSD7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action options date details."
 * </li>
 * </ul>
 */
public class CorporateActionDateSD7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max350Text placeAndName;
	/**
	 * xPath to the element that is being extended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceAndName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ISODateTime actualEarlyExpirationDate;
	/**
	 * Actual early expiration time as set by the issuer/offer/agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlEarlyXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualEarlyExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actual early expiration time as set by the issuer/offer/agent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActualEarlyExpirationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "ActlEarlyXprtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualEarlyExpirationDate";
			definition = "Actual early expiration time as set by the issuer/offer/agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime actualProtectExpirationDate;
	/**
	 * Last day protect instructions can be submitted to the issuer / agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlPrtctXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day protect instructions can be submitted to the issuer / agent. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActualProtectExpirationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "ActlPrtctXprtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualProtectExpirationDate";
			definition = "Last day protect instructions can be submitted to the issuer / agent. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime actualEarlyProtectExpirationDate;
	/**
	 * Last day protect instructions can be submitted to the issuer / agent for
	 * the early expiration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlEarlyPrtctXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualEarlyProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day protect instructions can be submitted to the issuer / agent for the early expiration. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActualEarlyProtectExpirationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "ActlEarlyPrtctXprtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualEarlyProtectExpirationDate";
			definition = "Last day protect instructions can be submitted to the issuer / agent for the early expiration. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime dTCEarlyProtectExpirationDate;
	/**
	 * Last day protect instructions can be submitted to DTC for the early
	 * expiration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCEarlyPrtctXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCEarlyProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day protect instructions can be submitted to DTC for the early expiration."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCEarlyProtectExpirationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCEarlyPrtctXprtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCEarlyProtectExpirationDate";
			definition = "Last day protect instructions can be submitted to DTC for the early expiration.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime actualEarlyCoverProtectExpirationDate;
	/**
	 * Last day cover early protect instructions can be submitted to the issuer
	 * / agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlEarlyCoverPrtctXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualEarlyCoverProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day cover early protect instructions can be submitted to the issuer / agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActualEarlyCoverProtectExpirationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "ActlEarlyCoverPrtctXprtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualEarlyCoverProtectExpirationDate";
			definition = "Last day cover early protect instructions can be submitted to the issuer / agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime dTCEarlyCoverProtectExpirationDate;
	/**
	 * Last day cover early protect instructions can be submitted to DTC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCEarlyCoverPrtctXprtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCEarlyCoverProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day cover early protect instructions can be submitted to DTC."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCEarlyCoverProtectExpirationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCEarlyCoverPrtctXprtnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCEarlyCoverProtectExpirationDate";
			definition = "Last day cover early protect instructions can be submitted to DTC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDateSD7.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionDateSD7.mmActualEarlyExpirationDate,
						com.tools20022.repository.msg.CorporateActionDateSD7.mmActualProtectExpirationDate, com.tools20022.repository.msg.CorporateActionDateSD7.mmActualEarlyProtectExpirationDate,
						com.tools20022.repository.msg.CorporateActionDateSD7.mmDTCEarlyProtectExpirationDate, com.tools20022.repository.msg.CorporateActionDateSD7.mmActualEarlyCoverProtectExpirationDate,
						com.tools20022.repository.msg.CorporateActionDateSD7.mmDTCEarlyCoverProtectExpirationDate);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionDateSD7";
				definition = "Provides additional information regarding corporate action options date details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	public ISODateTime getActualEarlyExpirationDate() {
		return actualEarlyExpirationDate;
	}

	public void setActualEarlyExpirationDate(ISODateTime actualEarlyExpirationDate) {
		this.actualEarlyExpirationDate = actualEarlyExpirationDate;
	}

	public ISODateTime getActualProtectExpirationDate() {
		return actualProtectExpirationDate;
	}

	public void setActualProtectExpirationDate(ISODateTime actualProtectExpirationDate) {
		this.actualProtectExpirationDate = actualProtectExpirationDate;
	}

	public ISODateTime getActualEarlyProtectExpirationDate() {
		return actualEarlyProtectExpirationDate;
	}

	public void setActualEarlyProtectExpirationDate(ISODateTime actualEarlyProtectExpirationDate) {
		this.actualEarlyProtectExpirationDate = actualEarlyProtectExpirationDate;
	}

	public ISODateTime getDTCEarlyProtectExpirationDate() {
		return dTCEarlyProtectExpirationDate;
	}

	public void setDTCEarlyProtectExpirationDate(ISODateTime dTCEarlyProtectExpirationDate) {
		this.dTCEarlyProtectExpirationDate = dTCEarlyProtectExpirationDate;
	}

	public ISODateTime getActualEarlyCoverProtectExpirationDate() {
		return actualEarlyCoverProtectExpirationDate;
	}

	public void setActualEarlyCoverProtectExpirationDate(ISODateTime actualEarlyCoverProtectExpirationDate) {
		this.actualEarlyCoverProtectExpirationDate = actualEarlyCoverProtectExpirationDate;
	}

	public ISODateTime getDTCEarlyCoverProtectExpirationDate() {
		return dTCEarlyCoverProtectExpirationDate;
	}

	public void setDTCEarlyCoverProtectExpirationDate(ISODateTime dTCEarlyCoverProtectExpirationDate) {
		this.dTCEarlyCoverProtectExpirationDate = dTCEarlyCoverProtectExpirationDate;
	}
}