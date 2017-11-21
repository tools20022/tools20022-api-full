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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action securities
 * movement date details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementDateDetailsExtension1#mmPlaceAndName
 * CorporateActionOptionSecuritiesMovementDateDetailsExtension1.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementDateDetailsExtension1#mmDTCAllocationDateAndTime
 * CorporateActionOptionSecuritiesMovementDateDetailsExtension1.
 * mmDTCAllocationDateAndTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementDateDetailsExtension1#mmDTCCILAllocationDateAndTime
 * CorporateActionOptionSecuritiesMovementDateDetailsExtension1.
 * mmDTCCILAllocationDateAndTime}</li>
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
 * "CorporateActionOptionSecuritiesMovementDateDetailsExtension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action securities movement date details."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionOptionSecuritiesMovementDateDetailsExtension1", propOrder = {"placeAndName", "DTCAllocationDateAndTime", "DTCCILAllocationDateAndTime"})
public class CorporateActionOptionSecuritiesMovementDateDetailsExtension1 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementDateDetailsExtension1
	 * CorporateActionOptionSecuritiesMovementDateDetailsExtension1}</li>
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
			componentContext_lazy = () -> CorporateActionOptionSecuritiesMovementDateDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ISODateTime dTCAllocationDateAndTime;
	/**
	 * Date and time at which DTC (The Depository Trust Corporation) will
	 * allocate payments to its participants.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementDateDetailsExtension1
	 * CorporateActionOptionSecuritiesMovementDateDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCAllcnDtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCAllocationDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which DTC (The Depository Trust Corporation) will allocate payments to its participants."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCAllocationDateAndTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSecuritiesMovementDateDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "DTCAllcnDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCAllocationDateAndTime";
			definition = "Date and time at which DTC (The Depository Trust Corporation) will allocate payments to its participants.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime dTCCILAllocationDateAndTime;
	/**
	 * Date and time at which Cash In Lieu (CIL) will be paid to DTC (The
	 * Depository Trust Corporation) participants. On a single option that has
	 * multiple payouts, one of which is CIL, the payouts can be allocated on
	 * different days.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSecuritiesMovementDateDetailsExtension1
	 * CorporateActionOptionSecuritiesMovementDateDetailsExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCCILAllcnDtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCILAllocationDateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which Cash In Lieu (CIL) will be paid to DTC  (The Depository Trust Corporation) participants. On a single option that has multiple payouts, one of which is CIL, the payouts can be allocated on different days."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDTCCILAllocationDateAndTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSecuritiesMovementDateDetailsExtension1.mmObject();
			isDerived = false;
			xmlTag = "DTCCILAllcnDtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCILAllocationDateAndTime";
			definition = "Date and time at which Cash In Lieu (CIL) will be paid to DTC  (The Depository Trust Corporation) participants. On a single option that has multiple payouts, one of which is CIL, the payouts can be allocated on different days.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionOptionSecuritiesMovementDateDetailsExtension1.mmPlaceAndName, CorporateActionOptionSecuritiesMovementDateDetailsExtension1.mmDTCAllocationDateAndTime,
						CorporateActionOptionSecuritiesMovementDateDetailsExtension1.mmDTCCILAllocationDateAndTime);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionOptionSecuritiesMovementDateDetailsExtension1";
				definition = "Provides additional information regarding corporate action securities movement date details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PlcAndNm", required = true)
	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public void setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
	}

	@XmlElement(name = "DTCAllcnDtAndTm")
	public ISODateTime getDTCAllocationDateAndTime() {
		return dTCAllocationDateAndTime;
	}

	public void setDTCAllocationDateAndTime(ISODateTime dTCAllocationDateAndTime) {
		this.dTCAllocationDateAndTime = dTCAllocationDateAndTime;
	}

	@XmlElement(name = "DTCCILAllcnDtAndTm")
	public ISODateTime getDTCCILAllocationDateAndTime() {
		return dTCCILAllocationDateAndTime;
	}

	public void setDTCCILAllocationDateAndTime(ISODateTime dTCCILAllocationDateAndTime) {
		this.dTCCILAllocationDateAndTime = dTCCILAllocationDateAndTime;
	}
}