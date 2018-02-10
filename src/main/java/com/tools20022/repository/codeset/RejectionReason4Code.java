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
import com.tools20022.repository.codeset.RejectionReason4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for which an execution has not been accepted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason4Code#UnknownSymbol
 * RejectionReason4Code.UnknownSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason4Code#WrongSide
 * RejectionReason4Code.WrongSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason4Code#NoMatchInquiry
 * RejectionReason4Code.NoMatchInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason4Code#QuantityExceeds
 * RejectionReason4Code.QuantityExceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason4Code#PriceExceeds
 * RejectionReason4Code.PriceExceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason4Code#CalculationDifference
 * RejectionReason4Code.CalculationDifference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
 * RejectionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"UKWN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for which an execution has not been accepted."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason4Code
	 * RejectionReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownSymbol"</li>
	 * </ul>
	 */
	public static final RejectionReason4Code UnknownSymbol = new RejectionReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownSymbol";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason4Code.mmObject();
			codeName = RejectionReasonCode.UnknownSymbol.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason4Code
	 * RejectionReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongSide"</li>
	 * </ul>
	 */
	public static final RejectionReason4Code WrongSide = new RejectionReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongSide";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason4Code.mmObject();
			codeName = RejectionReasonCode.WrongSide.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason4Code
	 * RejectionReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchInquiry"</li>
	 * </ul>
	 */
	public static final RejectionReason4Code NoMatchInquiry = new RejectionReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason4Code.mmObject();
			codeName = RejectionReasonCode.NoMatchInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason4Code
	 * RejectionReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityExceeds"</li>
	 * </ul>
	 */
	public static final RejectionReason4Code QuantityExceeds = new RejectionReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityExceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason4Code.mmObject();
			codeName = RejectionReasonCode.QuantityExceeds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason4Code
	 * RejectionReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceExceeds"</li>
	 * </ul>
	 */
	public static final RejectionReason4Code PriceExceeds = new RejectionReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceExceeds";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason4Code.mmObject();
			codeName = RejectionReasonCode.PriceExceeds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason4Code
	 * RejectionReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDifference"</li>
	 * </ul>
	 */
	public static final RejectionReason4Code CalculationDifference = new RejectionReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDifference";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason4Code.mmObject();
			codeName = RejectionReasonCode.CalculationDifference.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason4Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UKWN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason4Code";
				definition = "Specifies the reason for which an execution has not been accepted.";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason4Code.UnknownSymbol, com.tools20022.repository.codeset.RejectionReason4Code.WrongSide,
						com.tools20022.repository.codeset.RejectionReason4Code.NoMatchInquiry, com.tools20022.repository.codeset.RejectionReason4Code.QuantityExceeds, com.tools20022.repository.codeset.RejectionReason4Code.PriceExceeds,
						com.tools20022.repository.codeset.RejectionReason4Code.CalculationDifference);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnknownSymbol.getCodeName().get(), UnknownSymbol);
		codesByName.put(WrongSide.getCodeName().get(), WrongSide);
		codesByName.put(NoMatchInquiry.getCodeName().get(), NoMatchInquiry);
		codesByName.put(QuantityExceeds.getCodeName().get(), QuantityExceeds);
		codesByName.put(PriceExceeds.getCodeName().get(), PriceExceeds);
		codesByName.put(CalculationDifference.getCodeName().get(), CalculationDifference);
	}

	public static RejectionReason4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason4Code[] values() {
		RejectionReason4Code[] values = new RejectionReason4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason4Code> {
		@Override
		public RejectionReason4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}