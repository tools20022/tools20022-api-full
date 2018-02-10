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
import com.tools20022.repository.codeset.FundOrderType6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the category of the investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.FundOrderType6Code#All
 * FundOrderType6Code.All}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code#Redemption
 * FundOrderType6Code.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code#Subscription
 * FundOrderType6Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code#SwitchFrom
 * FundOrderType6Code.SwitchFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code#SwitchTo
 * FundOrderType6Code.SwitchTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code#TransferIn
 * FundOrderType6Code.TransferIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code#TransferOut
 * FundOrderType6Code.TransferOut}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
 * FundOrderTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ALLL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundOrderType6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the category of the investment fund order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FundOrderType6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code
	 * FundOrderType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "All"</li>
	 * </ul>
	 */
	public static final FundOrderType6Code All = new FundOrderType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "All";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType6Code.mmObject();
			codeName = FundOrderTypeCode.All.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code
	 * FundOrderType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * </ul>
	 */
	public static final FundOrderType6Code Redemption = new FundOrderType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType6Code.mmObject();
			codeName = FundOrderTypeCode.Redemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code
	 * FundOrderType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * </ul>
	 */
	public static final FundOrderType6Code Subscription = new FundOrderType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType6Code.mmObject();
			codeName = FundOrderTypeCode.Subscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code
	 * FundOrderType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchFrom"</li>
	 * </ul>
	 */
	public static final FundOrderType6Code SwitchFrom = new FundOrderType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchFrom";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType6Code.mmObject();
			codeName = FundOrderTypeCode.SwitchFrom.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code
	 * FundOrderType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchTo"</li>
	 * </ul>
	 */
	public static final FundOrderType6Code SwitchTo = new FundOrderType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchTo";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType6Code.mmObject();
			codeName = FundOrderTypeCode.SwitchTo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code
	 * FundOrderType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIn"</li>
	 * </ul>
	 */
	public static final FundOrderType6Code TransferIn = new FundOrderType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIn";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType6Code.mmObject();
			codeName = FundOrderTypeCode.TransferIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FundOrderType6Code
	 * FundOrderType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOut"</li>
	 * </ul>
	 */
	public static final FundOrderType6Code TransferOut = new FundOrderType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOut";
			owner_lazy = () -> com.tools20022.repository.codeset.FundOrderType6Code.mmObject();
			codeName = FundOrderTypeCode.TransferOut.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FundOrderType6Code> codesByName = new LinkedHashMap<>();

	protected FundOrderType6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ALLL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundOrderType6Code";
				definition = "Specifies the category of the investment fund order.";
				trace_lazy = () -> FundOrderTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FundOrderType6Code.All, com.tools20022.repository.codeset.FundOrderType6Code.Redemption, com.tools20022.repository.codeset.FundOrderType6Code.Subscription,
						com.tools20022.repository.codeset.FundOrderType6Code.SwitchFrom, com.tools20022.repository.codeset.FundOrderType6Code.SwitchTo, com.tools20022.repository.codeset.FundOrderType6Code.TransferIn,
						com.tools20022.repository.codeset.FundOrderType6Code.TransferOut);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(All.getCodeName().get(), All);
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(SwitchFrom.getCodeName().get(), SwitchFrom);
		codesByName.put(SwitchTo.getCodeName().get(), SwitchTo);
		codesByName.put(TransferIn.getCodeName().get(), TransferIn);
		codesByName.put(TransferOut.getCodeName().get(), TransferOut);
	}

	public static FundOrderType6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FundOrderType6Code[] values() {
		FundOrderType6Code[] values = new FundOrderType6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FundOrderType6Code> {
		@Override
		public FundOrderType6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FundOrderType6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}