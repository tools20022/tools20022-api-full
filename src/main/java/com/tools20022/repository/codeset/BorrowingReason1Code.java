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
import com.tools20022.repository.codeset.BorrowingReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the underlying reason for the borrowing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BorrowingReason1Code#SelfConsumption
 * BorrowingReason1Code.SelfConsumption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BorrowingReason1Code#TransferToThirdParty
 * BorrowingReason1Code.TransferToThirdParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BorrowingReason1Code#MarketMakingPurpose
 * BorrowingReason1Code.MarketMakingPurpose}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BorrowingReasonCode
 * BorrowingReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SFCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BorrowingReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the underlying reason for the borrowing."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BorrowingReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BorrowingReason1Code
	 * BorrowingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfConsumption"</li>
	 * </ul>
	 */
	public static final BorrowingReason1Code SelfConsumption = new BorrowingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfConsumption";
			owner_lazy = () -> com.tools20022.repository.codeset.BorrowingReason1Code.mmObject();
			codeName = BorrowingReasonCode.SelfConsumption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BorrowingReason1Code
	 * BorrowingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferToThirdParty"</li>
	 * </ul>
	 */
	public static final BorrowingReason1Code TransferToThirdParty = new BorrowingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferToThirdParty";
			owner_lazy = () -> com.tools20022.repository.codeset.BorrowingReason1Code.mmObject();
			codeName = BorrowingReasonCode.TransferToThirdParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BorrowingReason1Code
	 * BorrowingReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMakingPurpose"</li>
	 * </ul>
	 */
	public static final BorrowingReason1Code MarketMakingPurpose = new BorrowingReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMakingPurpose";
			owner_lazy = () -> com.tools20022.repository.codeset.BorrowingReason1Code.mmObject();
			codeName = BorrowingReasonCode.MarketMakingPurpose.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BorrowingReason1Code> codesByName = new LinkedHashMap<>();

	protected BorrowingReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SFCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BorrowingReason1Code";
				definition = "Identifies the underlying reason for the borrowing.";
				trace_lazy = () -> BorrowingReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BorrowingReason1Code.SelfConsumption, com.tools20022.repository.codeset.BorrowingReason1Code.TransferToThirdParty,
						com.tools20022.repository.codeset.BorrowingReason1Code.MarketMakingPurpose);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SelfConsumption.getCodeName().get(), SelfConsumption);
		codesByName.put(TransferToThirdParty.getCodeName().get(), TransferToThirdParty);
		codesByName.put(MarketMakingPurpose.getCodeName().get(), MarketMakingPurpose);
	}

	public static BorrowingReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BorrowingReason1Code[] values() {
		BorrowingReason1Code[] values = new BorrowingReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BorrowingReason1Code> {
		@Override
		public BorrowingReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BorrowingReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}