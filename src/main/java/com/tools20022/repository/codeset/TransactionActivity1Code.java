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
import com.tools20022.repository.codeset.TransactionActivity1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of activity to which this transaction relates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionActivity1Code#BorrowingLendingActivity
 * TransactionActivity1Code.BorrowingLendingActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionActivity1Code#MarketClaim
 * TransactionActivity1Code.MarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionActivity1Code#CollateralActivity
 * TransactionActivity1Code.CollateralActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionActivity1Code#CorporateActionActivity
 * TransactionActivity1Code.CorporateActionActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionActivity1Code#SettlementandClearingActivity
 * TransactionActivity1Code.SettlementandClearingActivity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TransactionActivityCode
 * TransactionActivityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BOLE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionActivity1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of activity to which this transaction relates."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionActivity1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivity1Code
	 * TransactionActivity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingLendingActivity"</li>
	 * </ul>
	 */
	public static final TransactionActivity1Code BorrowingLendingActivity = new TransactionActivity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingLendingActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionActivity1Code.mmObject();
			codeName = TransactionActivityCode.BorrowingLendingActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivity1Code
	 * TransactionActivity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * </ul>
	 */
	public static final TransactionActivity1Code MarketClaim = new TransactionActivity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionActivity1Code.mmObject();
			codeName = TransactionActivityCode.MarketClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivity1Code
	 * TransactionActivity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralActivity"</li>
	 * </ul>
	 */
	public static final TransactionActivity1Code CollateralActivity = new TransactionActivity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionActivity1Code.mmObject();
			codeName = TransactionActivityCode.CollateralActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivity1Code
	 * TransactionActivity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionActivity"</li>
	 * </ul>
	 */
	public static final TransactionActivity1Code CorporateActionActivity = new TransactionActivity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionActivity1Code.mmObject();
			codeName = TransactionActivityCode.CorporateActionActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionActivity1Code
	 * TransactionActivity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementandClearingActivity"</li>
	 * </ul>
	 */
	public static final TransactionActivity1Code SettlementandClearingActivity = new TransactionActivity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementandClearingActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionActivity1Code.mmObject();
			codeName = TransactionActivityCode.SettlementandClearingActivity.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionActivity1Code> codesByName = new LinkedHashMap<>();

	protected TransactionActivity1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BOLE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionActivity1Code";
				definition = "Specifies the type of activity to which this transaction relates.";
				trace_lazy = () -> TransactionActivityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionActivity1Code.BorrowingLendingActivity, com.tools20022.repository.codeset.TransactionActivity1Code.MarketClaim,
						com.tools20022.repository.codeset.TransactionActivity1Code.CollateralActivity, com.tools20022.repository.codeset.TransactionActivity1Code.CorporateActionActivity,
						com.tools20022.repository.codeset.TransactionActivity1Code.SettlementandClearingActivity);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BorrowingLendingActivity.getCodeName().get(), BorrowingLendingActivity);
		codesByName.put(MarketClaim.getCodeName().get(), MarketClaim);
		codesByName.put(CollateralActivity.getCodeName().get(), CollateralActivity);
		codesByName.put(CorporateActionActivity.getCodeName().get(), CorporateActionActivity);
		codesByName.put(SettlementandClearingActivity.getCodeName().get(), SettlementandClearingActivity);
	}

	public static TransactionActivity1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionActivity1Code[] values() {
		TransactionActivity1Code[] values = new TransactionActivity1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionActivity1Code> {
		@Override
		public TransactionActivity1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionActivity1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}