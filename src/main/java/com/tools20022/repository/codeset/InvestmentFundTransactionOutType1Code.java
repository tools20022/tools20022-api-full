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
import com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of investment fund transaction that results in a cash
 * movement out of a fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code#Redemption
 * InvestmentFundTransactionOutType1Code.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code#SwitchOut
 * InvestmentFundTransactionOutType1Code.SwitchOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code#InSpecie
 * InvestmentFundTransactionOutType1Code.InSpecie}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code#CrossOut
 * InvestmentFundTransactionOutType1Code.CrossOut}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionTypeCode
 * InvestmentFundTransactionTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"REDM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundTransactionOutType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of investment fund transaction that results in a cash movement out of a fund."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InvestmentFundTransactionOutType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code
	 * InvestmentFundTransactionOutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionOutType1Code Redemption = new InvestmentFundTransactionOutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.Redemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code
	 * InvestmentFundTransactionOutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchOut"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionOutType1Code SwitchOut = new InvestmentFundTransactionOutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchOut";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.SwitchOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code
	 * InvestmentFundTransactionOutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InSpecie"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionOutType1Code InSpecie = new InvestmentFundTransactionOutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InSpecie";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.InSpecie.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code
	 * InvestmentFundTransactionOutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossOut"</li>
	 * </ul>
	 */
	public static final InvestmentFundTransactionOutType1Code CrossOut = new InvestmentFundTransactionOutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossOut";
			owner_lazy = () -> com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code.mmObject();
			codeName = InvestmentFundTransactionTypeCode.CrossOut.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InvestmentFundTransactionOutType1Code> codesByName = new LinkedHashMap<>();

	protected InvestmentFundTransactionOutType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("REDM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundTransactionOutType1Code";
				definition = "Specifies the type of investment fund transaction that results in a cash movement out of a fund.";
				trace_lazy = () -> InvestmentFundTransactionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code.Redemption, com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code.SwitchOut,
						com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code.InSpecie, com.tools20022.repository.codeset.InvestmentFundTransactionOutType1Code.CrossOut);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(SwitchOut.getCodeName().get(), SwitchOut);
		codesByName.put(InSpecie.getCodeName().get(), InSpecie);
		codesByName.put(CrossOut.getCodeName().get(), CrossOut);
	}

	public static InvestmentFundTransactionOutType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InvestmentFundTransactionOutType1Code[] values() {
		InvestmentFundTransactionOutType1Code[] values = new InvestmentFundTransactionOutType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InvestmentFundTransactionOutType1Code> {
		@Override
		public InvestmentFundTransactionOutType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InvestmentFundTransactionOutType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}