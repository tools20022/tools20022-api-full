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
import com.tools20022.repository.choice.SafekeepingPlaceFormatChoice;
import com.tools20022.repository.choice.UnitOrFaceAmount1Choice;
import com.tools20022.repository.codeset.SecuritiesEntryType2Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.MeetingEntitlement;
import com.tools20022.repository.entity.SafekeepingPlace;
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Net position of a segregated holding of a single security within the overall
 * position held in the securities account, eg, sub-balance per status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance6#mmBalance
 * HoldingBalance6.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance6#mmBalanceType
 * HoldingBalance6.mmBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance6#mmSafekeepingPlace
 * HoldingBalance6.mmSafekeepingPlace}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance6#mmDate
 * HoldingBalance6.mmDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
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
 * "HoldingBalance6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding of a single security within the overall position held in the securities account, eg, sub-balance per status."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance7
 * HoldingBalance7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "HoldingBalance6", propOrder = {"balance", "balanceType", "safekeepingPlace", "date"})
public class HoldingBalance6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected UnitOrFaceAmount1Choice balance;
	/**
	 * Total quantity of financial instrument for the referenced holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAggregateQuantity
	 * SecuritiesBalance.mmAggregateQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance6
	 * HoldingBalance6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instrument for the referenced holding."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance7#mmBalance
	 * HoldingBalance7.mmBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAggregateQuantity;
			componentContext_lazy = () -> HoldingBalance6.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Total quantity of financial instrument for the referenced holding.";
			nextVersions_lazy = () -> Arrays.asList(HoldingBalance7.mmBalance);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected SecuritiesEntryType2Code balanceType;
	/**
	 * Reason a security is not available or additional information about the
	 * financial instrument for which the balance is given, for example,
	 * unregistered, registered in nominee name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesEntryType2Code
	 * SecuritiesEntryType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance6
	 * HoldingBalance6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason a security is not available or additional information about the financial instrument for which the balance is given, for example, unregistered, registered in nominee name."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance7#mmBalanceType
	 * HoldingBalance7.mmBalanceType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalanceType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> HoldingBalance6.mmObject();
			isDerived = false;
			xmlTag = "BalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceType";
			definition = "Reason a security is not available or additional information about the financial instrument for which the balance is given, for example, unregistered, registered in nominee name.";
			nextVersions_lazy = () -> Arrays.asList(HoldingBalance7.mmBalanceType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SecuritiesEntryType2Code.mmObject();
		}
	};
	protected SafekeepingPlaceFormatChoice safekeepingPlace;
	/**
	 * Place where the securities are safe-kept, physically or notionally. This
	 * place can be, for example, a local custodian, a Central Securities
	 * Depository (CSD) or an International Central Securities Depository
	 * (ICSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice
	 * SafekeepingPlaceFormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance6
	 * HoldingBalance6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance7#mmSafekeepingPlace
	 * HoldingBalance7.mmSafekeepingPlace}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSafekeepingPlace = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> HoldingBalance6.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally.  This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			nextVersions_lazy = () -> Arrays.asList(HoldingBalance7.mmSafekeepingPlace);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SafekeepingPlaceFormatChoice.mmObject();
		}
	};
	protected ISODate date;
	/**
	 * Date of the entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement#mmEntitlementFixingDate
	 * MeetingEntitlement.mmEntitlementFixingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldingBalance6
	 * HoldingBalance6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the entitlement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.HoldingBalance7#mmDate
	 * HoldingBalance7.mmDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingEntitlement.mmEntitlementFixingDate;
			componentContext_lazy = () -> HoldingBalance6.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date of the entitlement.";
			nextVersions_lazy = () -> Arrays.asList(HoldingBalance7.mmDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(HoldingBalance6.mmBalance, HoldingBalance6.mmBalanceType, HoldingBalance6.mmSafekeepingPlace, HoldingBalance6.mmDate);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HoldingBalance6";
				definition = "Net position of a segregated holding of a single security within the overall position held in the securities account, eg, sub-balance per status.";
				nextVersions_lazy = () -> Arrays.asList(HoldingBalance7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Bal")
	public UnitOrFaceAmount1Choice getBalance() {
		return balance;
	}

	public void setBalance(UnitOrFaceAmount1Choice balance) {
		this.balance = balance;
	}

	@XmlElement(name = "BalTp")
	public SecuritiesEntryType2Code getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(SecuritiesEntryType2Code balanceType) {
		this.balanceType = balanceType;
	}

	@XmlElement(name = "SfkpgPlc")
	public SafekeepingPlaceFormatChoice getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public void setSafekeepingPlace(SafekeepingPlaceFormatChoice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
	}

	@XmlElement(name = "Dt")
	public ISODate getDate() {
		return date;
	}

	public void setDate(ISODate date) {
		this.date = date;
	}
}