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
import com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of intermediate security distribution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#ReverseRights
 * IntermediateSecurityDistributionType4Code.ReverseRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#DividendReinvestment
 * IntermediateSecurityDistributionType4Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#CashDividend
 * IntermediateSecurityDistributionType4Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#DividendOption
 * IntermediateSecurityDistributionType4Code.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#SubscriptionRights
 * IntermediateSecurityDistributionType4Code.SubscriptionRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#OpenOfferRights
 * IntermediateSecurityDistributionType4Code.OpenOfferRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#ScripDividendOrPayment
 * IntermediateSecurityDistributionType4Code.ScripDividendOrPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#StockDividend
 * IntermediateSecurityDistributionType4Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#InterestPayment
 * IntermediateSecurityDistributionType4Code.InterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#LiquidationDividendOrPayment
 * IntermediateSecurityDistributionType4Code.LiquidationDividendOrPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#SpinOff
 * IntermediateSecurityDistributionType4Code.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#StockSplit
 * IntermediateSecurityDistributionType4Code.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#BonusRights
 * IntermediateSecurityDistributionType4Code.BonusRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code#Exchange
 * IntermediateSecurityDistributionType4Code.Exchange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionTypeCode
 * IntermediateSecurityDistributionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BIDS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntermediateSecurityDistributionType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of intermediate security distribution."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType5Code
 * IntermediateSecurityDistributionType5Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IntermediateSecurityDistributionType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRights"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code ReverseRights = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRights";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.ReverseRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code DividendReinvestment = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.DividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code CashDividend = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code DividendOption = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.DividendOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionRights"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code SubscriptionRights = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionRights";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.SubscriptionRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenOfferRights"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code OpenOfferRights = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenOfferRights";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.OpenOfferRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividendOrPayment"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code ScripDividendOrPayment = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividendOrPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.ScripDividendOrPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code StockDividend = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code InterestPayment = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.InterestPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividendOrPayment"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code LiquidationDividendOrPayment = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationDividendOrPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.LiquidationDividendOrPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code SpinOff = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.SpinOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code StockSplit = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusRights"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code BonusRights = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusRights";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.BonusRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code
	 * IntermediateSecurityDistributionType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exchange"</li>
	 * </ul>
	 */
	public static final IntermediateSecurityDistributionType4Code Exchange = new IntermediateSecurityDistributionType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			owner_lazy = () -> com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.mmObject();
			codeName = IntermediateSecurityDistributionTypeCode.Exchange.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, IntermediateSecurityDistributionType4Code> codesByName = new LinkedHashMap<>();

	protected IntermediateSecurityDistributionType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BIDS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntermediateSecurityDistributionType4Code";
				definition = "Specifies the type of intermediate security distribution.";
				nextVersions_lazy = () -> Arrays.asList(IntermediateSecurityDistributionType5Code.mmObject());
				trace_lazy = () -> IntermediateSecurityDistributionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.ReverseRights, com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.DividendReinvestment,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.CashDividend, com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.DividendOption,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.SubscriptionRights, com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.OpenOfferRights,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.ScripDividendOrPayment, com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.StockDividend,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.InterestPayment, com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.LiquidationDividendOrPayment,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.SpinOff, com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.StockSplit,
						com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.BonusRights, com.tools20022.repository.codeset.IntermediateSecurityDistributionType4Code.Exchange);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReverseRights.getCodeName().get(), ReverseRights);
		codesByName.put(DividendReinvestment.getCodeName().get(), DividendReinvestment);
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(DividendOption.getCodeName().get(), DividendOption);
		codesByName.put(SubscriptionRights.getCodeName().get(), SubscriptionRights);
		codesByName.put(OpenOfferRights.getCodeName().get(), OpenOfferRights);
		codesByName.put(ScripDividendOrPayment.getCodeName().get(), ScripDividendOrPayment);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(InterestPayment.getCodeName().get(), InterestPayment);
		codesByName.put(LiquidationDividendOrPayment.getCodeName().get(), LiquidationDividendOrPayment);
		codesByName.put(SpinOff.getCodeName().get(), SpinOff);
		codesByName.put(StockSplit.getCodeName().get(), StockSplit);
		codesByName.put(BonusRights.getCodeName().get(), BonusRights);
		codesByName.put(Exchange.getCodeName().get(), Exchange);
	}

	public static IntermediateSecurityDistributionType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static IntermediateSecurityDistributionType4Code[] values() {
		IntermediateSecurityDistributionType4Code[] values = new IntermediateSecurityDistributionType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IntermediateSecurityDistributionType4Code> {
		@Override
		public IntermediateSecurityDistributionType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(IntermediateSecurityDistributionType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}