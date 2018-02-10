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
import com.tools20022.repository.codeset.HoldingTransferable1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicate whether or not registered investors are able to transfer some or all
 * of their holdings to third parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingTransferable1Code#TransferAllowed
 * HoldingTransferable1Code.TransferAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingTransferable1Code#TransferNotAllowed
 * HoldingTransferable1Code.TransferNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HoldingTransferable1Code#ReferToFundOrderDesk
 * HoldingTransferable1Code.ReferToFundOrderDesk}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.HoldingTransferableCode
 * HoldingTransferableCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"TRAL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "HoldingTransferable1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicate whether or not registered investors are able to transfer some or all of their holdings to third parties."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class HoldingTransferable1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingTransferable1Code
	 * HoldingTransferable1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAllowed"</li>
	 * </ul>
	 */
	public static final HoldingTransferable1Code TransferAllowed = new HoldingTransferable1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingTransferable1Code.mmObject();
			codeName = HoldingTransferableCode.TransferAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingTransferable1Code
	 * HoldingTransferable1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferNotAllowed"</li>
	 * </ul>
	 */
	public static final HoldingTransferable1Code TransferNotAllowed = new HoldingTransferable1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferNotAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingTransferable1Code.mmObject();
			codeName = HoldingTransferableCode.TransferNotAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingTransferable1Code
	 * HoldingTransferable1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferToFundOrderDesk"</li>
	 * </ul>
	 */
	public static final HoldingTransferable1Code ReferToFundOrderDesk = new HoldingTransferable1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferToFundOrderDesk";
			owner_lazy = () -> com.tools20022.repository.codeset.HoldingTransferable1Code.mmObject();
			codeName = HoldingTransferableCode.ReferToFundOrderDesk.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, HoldingTransferable1Code> codesByName = new LinkedHashMap<>();

	protected HoldingTransferable1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("TRAL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HoldingTransferable1Code";
				definition = "Indicate whether or not registered investors are able to transfer some or all of their holdings to third parties.";
				trace_lazy = () -> HoldingTransferableCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.HoldingTransferable1Code.TransferAllowed, com.tools20022.repository.codeset.HoldingTransferable1Code.TransferNotAllowed,
						com.tools20022.repository.codeset.HoldingTransferable1Code.ReferToFundOrderDesk);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TransferAllowed.getCodeName().get(), TransferAllowed);
		codesByName.put(TransferNotAllowed.getCodeName().get(), TransferNotAllowed);
		codesByName.put(ReferToFundOrderDesk.getCodeName().get(), ReferToFundOrderDesk);
	}

	public static HoldingTransferable1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static HoldingTransferable1Code[] values() {
		HoldingTransferable1Code[] values = new HoldingTransferable1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, HoldingTransferable1Code> {
		@Override
		public HoldingTransferable1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(HoldingTransferable1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}