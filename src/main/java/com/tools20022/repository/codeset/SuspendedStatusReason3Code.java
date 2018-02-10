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
import com.tools20022.repository.codeset.SuspendedStatusReason3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a suspended status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReason3Code#PriceSuspension
 * SuspendedStatusReason3Code.PriceSuspension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReason3Code#Overflow
 * SuspendedStatusReason3Code.Overflow}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReasonCode
 * SuspendedStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PRIC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SuspendedStatusReason3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for a suspended status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SuspendedStatusReason3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReason3Code
	 * SuspendedStatusReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceSuspension"</li>
	 * </ul>
	 */
	public static final SuspendedStatusReason3Code PriceSuspension = new SuspendedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceSuspension";
			owner_lazy = () -> com.tools20022.repository.codeset.SuspendedStatusReason3Code.mmObject();
			codeName = SuspendedStatusReasonCode.PriceSuspension.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SuspendedStatusReason3Code
	 * SuspendedStatusReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overflow"</li>
	 * </ul>
	 */
	public static final SuspendedStatusReason3Code Overflow = new SuspendedStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Overflow";
			owner_lazy = () -> com.tools20022.repository.codeset.SuspendedStatusReason3Code.mmObject();
			codeName = SuspendedStatusReasonCode.Overflow.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SuspendedStatusReason3Code> codesByName = new LinkedHashMap<>();

	protected SuspendedStatusReason3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PRIC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SuspendedStatusReason3Code";
				definition = "Specifies the reason for a suspended status.";
				trace_lazy = () -> SuspendedStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SuspendedStatusReason3Code.PriceSuspension, com.tools20022.repository.codeset.SuspendedStatusReason3Code.Overflow);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PriceSuspension.getCodeName().get(), PriceSuspension);
		codesByName.put(Overflow.getCodeName().get(), Overflow);
	}

	public static SuspendedStatusReason3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SuspendedStatusReason3Code[] values() {
		SuspendedStatusReason3Code[] values = new SuspendedStatusReason3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SuspendedStatusReason3Code> {
		@Override
		public SuspendedStatusReason3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SuspendedStatusReason3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}