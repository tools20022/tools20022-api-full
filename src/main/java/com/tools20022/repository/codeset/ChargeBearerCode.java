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
import com.tools20022.repository.codeset.ChargeBearerCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies which party(ies) will pay charges due for processing of the payment
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode#BorneByDebtor
 * ChargeBearerCode.BorneByDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode#BorneByCreditor
 * ChargeBearerCode.BorneByCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeBearerCode#Shared
 * ChargeBearerCode.Shared}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeBearerCode#Investor
 * ChargeBearerCode.Investor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode#Intermediary
 * ChargeBearerCode.Intermediary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeBearer1Code
 * ChargeBearer1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OUR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeBearerCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies which party(ies) will pay charges due for processing of the payment transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeBearerCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * All transaction charges are to be borne by the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode
	 * ChargeBearerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OUR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All transaction charges are to be borne by the debtor."</li>
	 * </ul>
	 */
	public static final ChargeBearerCode BorneByDebtor = new ChargeBearerCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BorneByDebtor";
			definition = "All transaction charges are to be borne by the debtor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerCode.mmObject();
			codeName = "OUR";
		}
	};
	/**
	 * All transaction charges are to be borne by the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode
	 * ChargeBearerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All transaction charges are to be borne by the creditor."</li>
	 * </ul>
	 */
	public static final ChargeBearerCode BorneByCreditor = new ChargeBearerCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BorneByCreditor";
			definition = "All transaction charges are to be borne by the creditor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerCode.mmObject();
			codeName = "BEN";
		}
	};
	/**
	 * Under the credit transfer scenario, transaction charges on the sender's
	 * side are to be borne by the debtor; transaction charges on the receiver's
	 * side are to be borne by the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode
	 * ChargeBearerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Shared"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Under the credit transfer scenario, transaction charges on the sender's side are to be borne by the debtor; transaction charges on the receiver's side are to be borne by the creditor."
	 * </li>
	 * </ul>
	 */
	public static final ChargeBearerCode Shared = new ChargeBearerCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Shared";
			definition = "Under the credit transfer scenario, transaction charges on the sender's side are to be borne by the debtor; transaction charges on the receiver's side are to be borne by the creditor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerCode.mmObject();
			codeName = "SHA";
		}
	};
	/**
	 * All charges are to be borne by the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode
	 * ChargeBearerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All charges are to be borne by the investor."</li>
	 * </ul>
	 */
	public static final ChargeBearerCode Investor = new ChargeBearerCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Investor";
			definition = "All charges are to be borne by the investor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerCode.mmObject();
			codeName = "INVR";
		}
	};
	/**
	 * All charges are to be borne by the intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerCode
	 * ChargeBearerCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "All charges are to be borne by the intermediary."</li>
	 * </ul>
	 */
	public static final ChargeBearerCode Intermediary = new ChargeBearerCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Intermediary";
			definition = "All charges are to be borne by the intermediary.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeBearerCode.mmObject();
			codeName = "INTR";
		}
	};
	final static private LinkedHashMap<String, ChargeBearerCode> codesByName = new LinkedHashMap<>();

	protected ChargeBearerCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OUR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeBearerCode";
				definition = "Specifies which party(ies) will pay charges due for processing of the payment transaction.";
				derivation_lazy = () -> Arrays.asList(ChargeBearer1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeBearerCode.BorneByDebtor, com.tools20022.repository.codeset.ChargeBearerCode.BorneByCreditor,
						com.tools20022.repository.codeset.ChargeBearerCode.Shared, com.tools20022.repository.codeset.ChargeBearerCode.Investor, com.tools20022.repository.codeset.ChargeBearerCode.Intermediary);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BorneByDebtor.getCodeName().get(), BorneByDebtor);
		codesByName.put(BorneByCreditor.getCodeName().get(), BorneByCreditor);
		codesByName.put(Shared.getCodeName().get(), Shared);
		codesByName.put(Investor.getCodeName().get(), Investor);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
	}

	public static ChargeBearerCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeBearerCode[] values() {
		ChargeBearerCode[] values = new ChargeBearerCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeBearerCode> {
		@Override
		public ChargeBearerCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeBearerCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}