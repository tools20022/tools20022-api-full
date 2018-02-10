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
import com.tools20022.repository.codeset.UnderlyingInterestRateType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of an underlying contract for interest rate derivatives.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingInterestRateType3Code#Bond
 * UnderlyingInterestRateType3Code.Bond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingInterestRateType3Code#BondFuture
 * UnderlyingInterestRateType3Code.BondFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingInterestRateType3Code#InterestRate
 * UnderlyingInterestRateType3Code.InterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingInterestRateType3Code#InterestRateFutureFRA
 * UnderlyingInterestRateType3Code.InterestRateFutureFRA}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
 * UnderlyingTypeV3Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingInterestRateType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of an underlying contract for interest rate derivatives."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnderlyingInterestRateType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingInterestRateType3Code
	 * UnderlyingInterestRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bond"</li>
	 * </ul>
	 */
	public static final UnderlyingInterestRateType3Code Bond = new UnderlyingInterestRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingInterestRateType3Code.mmObject();
			codeName = UnderlyingTypeV3Code.Bond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingInterestRateType3Code
	 * UnderlyingInterestRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondFuture"</li>
	 * </ul>
	 */
	public static final UnderlyingInterestRateType3Code BondFuture = new UnderlyingInterestRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondFuture";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingInterestRateType3Code.mmObject();
			codeName = UnderlyingTypeV3Code.BondFuture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingInterestRateType3Code
	 * UnderlyingInterestRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * </ul>
	 */
	public static final UnderlyingInterestRateType3Code InterestRate = new UnderlyingInterestRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingInterestRateType3Code.mmObject();
			codeName = UnderlyingTypeV3Code.InterestRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingInterestRateType3Code
	 * UnderlyingInterestRateType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRateFutureFRA"</li>
	 * </ul>
	 */
	public static final UnderlyingInterestRateType3Code InterestRateFutureFRA = new UnderlyingInterestRateType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateFutureFRA";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingInterestRateType3Code.mmObject();
			codeName = UnderlyingTypeV3Code.InterestRateFutureFRA.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnderlyingInterestRateType3Code> codesByName = new LinkedHashMap<>();

	protected UnderlyingInterestRateType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingInterestRateType3Code";
				definition = "Specifies the type of an underlying contract for interest rate derivatives.";
				trace_lazy = () -> UnderlyingTypeV3Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnderlyingInterestRateType3Code.Bond, com.tools20022.repository.codeset.UnderlyingInterestRateType3Code.BondFuture,
						com.tools20022.repository.codeset.UnderlyingInterestRateType3Code.InterestRate, com.tools20022.repository.codeset.UnderlyingInterestRateType3Code.InterestRateFutureFRA);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Bond.getCodeName().get(), Bond);
		codesByName.put(BondFuture.getCodeName().get(), BondFuture);
		codesByName.put(InterestRate.getCodeName().get(), InterestRate);
		codesByName.put(InterestRateFutureFRA.getCodeName().get(), InterestRateFutureFRA);
	}

	public static UnderlyingInterestRateType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnderlyingInterestRateType3Code[] values() {
		UnderlyingInterestRateType3Code[] values = new UnderlyingInterestRateType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnderlyingInterestRateType3Code> {
		@Override
		public UnderlyingInterestRateType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnderlyingInterestRateType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}