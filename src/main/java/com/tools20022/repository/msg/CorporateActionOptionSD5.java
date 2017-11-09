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
import com.tools20022.repository.codeset.WorkflowStatus1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides additional information regarding corporate action option details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD5#mmPlaceAndName
 * CorporateActionOptionSD5.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD5#mmOptionStatus
 * CorporateActionOptionSD5.mmOptionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD5#mmRandomLotPreferenceFlag
 * CorporateActionOptionSD5.mmRandomLotPreferenceFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD5#mmNewShareDispatchedDate
 * CorporateActionOptionSD5.mmNewShareDispatchedDate}</li>
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
 * "CorporateActionOptionSD5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action option details."</li>
 * </ul>
 */
public class CorporateActionOptionSD5 {

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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD5
	 * CorporateActionOptionSD5}</li>
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
			componentContext_lazy = () -> CorporateActionOptionSD5.mmObject();
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
	protected WorkflowStatus1Code optionStatus;
	/**
	 * Workflow status of the specified option based on the consistency of the
	 * issuer declared data elements (excluding DTC data elements).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code
	 * WorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD5
	 * CorporateActionOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OptnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Workflow status of the specified option based on the consistency of the issuer declared data elements (excluding DTC data elements)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOptionStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "OptnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionStatus";
			definition = "Workflow status of the specified option based on the consistency of the issuer declared data elements (excluding DTC data elements).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> WorkflowStatus1Code.mmObject();
		}
	};
	protected YesNoIndicator randomLotPreferenceFlag;
	/**
	 * Indicates whether or not the offeror will select random lots if the offer
	 * has been prorated. The offeror may accept or reject conditional tenders
	 * on a random basis. Holders must indicate their willingness to have their
	 * rejected conditional tender accepted by random lot (if necessary). The
	 * holder must surrender all shares held in order to be eligible for this
	 * preference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD5
	 * CorporateActionOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RandLotPrefFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RandomLotPreferenceFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the offeror will select random lots if the offer has been prorated. The offeror may accept or reject conditional tenders on a random basis. Holders must indicate their willingness to have their rejected conditional tender accepted by random lot (if necessary). The holder must surrender all shares held in order to be eligible for this preference. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRandomLotPreferenceFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "RandLotPrefFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RandomLotPreferenceFlag";
			definition = "Indicates whether or not the offeror will select random lots if the offer has been prorated. The offeror may accept or reject conditional tenders on a random basis. Holders must indicate their willingness to have their rejected conditional tender accepted by random lot (if necessary). The holder must surrender all shares held in order to be eligible for this preference. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ISODate newShareDispatchedDate;
	/**
	 * Date on which the new shares to be issued will be distributed, as opposed
	 * to the "declared payable date." This date is typically used in some Asian
	 * markets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOptionSD5
	 * CorporateActionOptionSD5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewShrDsptchdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewShareDispatchedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the new shares to be issued will be distributed, as opposed to the \"declared payable date.\" This date is typically used in some Asian markets."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewShareDispatchedDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionOptionSD5.mmObject();
			isDerived = false;
			xmlTag = "NewShrDsptchdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewShareDispatchedDate";
			definition = "Date on which the new shares to be issued will be distributed, as opposed to the \"declared payable date.\" This date is typically used in some Asian markets.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionOptionSD5.mmPlaceAndName, CorporateActionOptionSD5.mmOptionStatus, CorporateActionOptionSD5.mmRandomLotPreferenceFlag,
						CorporateActionOptionSD5.mmNewShareDispatchedDate);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionOptionSD5";
				definition = "Provides additional information regarding corporate action option details.";
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

	public WorkflowStatus1Code getOptionStatus() {
		return optionStatus;
	}

	public void setOptionStatus(WorkflowStatus1Code optionStatus) {
		this.optionStatus = optionStatus;
	}

	public YesNoIndicator getRandomLotPreferenceFlag() {
		return randomLotPreferenceFlag;
	}

	public void setRandomLotPreferenceFlag(YesNoIndicator randomLotPreferenceFlag) {
		this.randomLotPreferenceFlag = randomLotPreferenceFlag;
	}

	public ISODate getNewShareDispatchedDate() {
		return newShareDispatchedDate;
	}

	public void setNewShareDispatchedDate(ISODate newShareDispatchedDate) {
		this.newShareDispatchedDate = newShareDispatchedDate;
	}
}