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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CorporateActionEventType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#DividendReinvestment
 * CorporateActionEventType1Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#CapitalGainsDistribution
 * CorporateActionEventType1Code.CapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#CashDividend
 * CorporateActionEventType1Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#DividendOption
 * CorporateActionEventType1Code.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#StockDividend
 * CorporateActionEventType1Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#Liquidation
 * CorporateActionEventType1Code.Liquidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#Merger
 * CorporateActionEventType1Code.Merger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#NameChange
 * CorporateActionEventType1Code.NameChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#SpinOff
 * CorporateActionEventType1Code.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#StockSplit
 * CorporateActionEventType1Code.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#ReverseStockSplit
 * CorporateActionEventType1Code.ReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#Tender
 * CorporateActionEventType1Code.Tender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#BonusIssue
 * CorporateActionEventType1Code.BonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#RightsDistribution
 * CorporateActionEventType1Code.RightsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#CallOnRights
 * CorporateActionEventType1Code.CallOnRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#Change
 * CorporateActionEventType1Code.Change}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#Redenomination
 * CorporateActionEventType1Code.Redenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#ExchangeOption
 * CorporateActionEventType1Code.ExchangeOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#ExchangeOffer
 * CorporateActionEventType1Code.ExchangeOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code#DecreaseInValue
 * CorporateActionEventType1Code.DecreaseInValue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeCode
 * CorporateActionEventTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DRIP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of corporate action event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code DividendReinvestment = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.DividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainsDistribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code CapitalGainsDistribution = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainsDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.CapitalGainsDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code CashDividend = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code DividendOption = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.DividendOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code StockDividend = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liquidation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code Liquidation = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liquidation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.Liquidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code Merger = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.Merger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameChange"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code NameChange = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameChange";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.NameChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code SpinOff = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.SpinOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code StockSplit = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseStockSplit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code ReverseStockSplit = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseStockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.ReverseStockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code Tender = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.Tender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code BonusIssue = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.BonusIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsDistribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code RightsDistribution = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.RightsDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnRights"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code CallOnRights = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnRights";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.CallOnRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code Change = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.Change.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redenomination"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code Redenomination = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.Redenomination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeOption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code ExchangeOption = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeOption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.ExchangeOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeOffer"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code ExchangeOffer = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.ExchangeOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseInValue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType1Code DecreaseInValue = new CorporateActionEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseInValue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType1Code.mmObject();
			codeName = CorporateActionEventTypeCode.DecreaseInValue.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventType1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DRIP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventType1Code";
				definition = "Specifies the type of corporate action event.";
				trace_lazy = () -> CorporateActionEventTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventType1Code.DividendReinvestment, com.tools20022.repository.codeset.CorporateActionEventType1Code.CapitalGainsDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType1Code.CashDividend, com.tools20022.repository.codeset.CorporateActionEventType1Code.DividendOption,
						com.tools20022.repository.codeset.CorporateActionEventType1Code.StockDividend, com.tools20022.repository.codeset.CorporateActionEventType1Code.Liquidation,
						com.tools20022.repository.codeset.CorporateActionEventType1Code.Merger, com.tools20022.repository.codeset.CorporateActionEventType1Code.NameChange,
						com.tools20022.repository.codeset.CorporateActionEventType1Code.SpinOff, com.tools20022.repository.codeset.CorporateActionEventType1Code.StockSplit,
						com.tools20022.repository.codeset.CorporateActionEventType1Code.ReverseStockSplit, com.tools20022.repository.codeset.CorporateActionEventType1Code.Tender,
						com.tools20022.repository.codeset.CorporateActionEventType1Code.BonusIssue, com.tools20022.repository.codeset.CorporateActionEventType1Code.RightsDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType1Code.CallOnRights, com.tools20022.repository.codeset.CorporateActionEventType1Code.Change,
						com.tools20022.repository.codeset.CorporateActionEventType1Code.Redenomination, com.tools20022.repository.codeset.CorporateActionEventType1Code.ExchangeOption,
						com.tools20022.repository.codeset.CorporateActionEventType1Code.ExchangeOffer, com.tools20022.repository.codeset.CorporateActionEventType1Code.DecreaseInValue);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DividendReinvestment.getCodeName().get(), DividendReinvestment);
		codesByName.put(CapitalGainsDistribution.getCodeName().get(), CapitalGainsDistribution);
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(DividendOption.getCodeName().get(), DividendOption);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(Liquidation.getCodeName().get(), Liquidation);
		codesByName.put(Merger.getCodeName().get(), Merger);
		codesByName.put(NameChange.getCodeName().get(), NameChange);
		codesByName.put(SpinOff.getCodeName().get(), SpinOff);
		codesByName.put(StockSplit.getCodeName().get(), StockSplit);
		codesByName.put(ReverseStockSplit.getCodeName().get(), ReverseStockSplit);
		codesByName.put(Tender.getCodeName().get(), Tender);
		codesByName.put(BonusIssue.getCodeName().get(), BonusIssue);
		codesByName.put(RightsDistribution.getCodeName().get(), RightsDistribution);
		codesByName.put(CallOnRights.getCodeName().get(), CallOnRights);
		codesByName.put(Change.getCodeName().get(), Change);
		codesByName.put(Redenomination.getCodeName().get(), Redenomination);
		codesByName.put(ExchangeOption.getCodeName().get(), ExchangeOption);
		codesByName.put(ExchangeOffer.getCodeName().get(), ExchangeOffer);
		codesByName.put(DecreaseInValue.getCodeName().get(), DecreaseInValue);
	}

	public static CorporateActionEventType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventType1Code[] values() {
		CorporateActionEventType1Code[] values = new CorporateActionEventType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventType1Code> {
		@Override
		public CorporateActionEventType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}